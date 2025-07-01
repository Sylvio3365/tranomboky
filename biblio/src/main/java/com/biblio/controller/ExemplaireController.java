package com.biblio.controller;

import com.biblio.model.Exemplaire;
import com.biblio.service.ExemplaireService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exemplaires")
public class ExemplaireController {
    private final ExemplaireService service;

    public ExemplaireController(ExemplaireService service) {
        this.service = service;
    }

    @GetMapping
    public List<Exemplaire> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exemplaire> get(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Exemplaire create(@RequestBody Exemplaire exemplaire) {
        return service.save(exemplaire);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Exemplaire> update(@PathVariable Integer id, @RequestBody Exemplaire exemplaire) {
        return service.findById(id)
                .map(existing -> {
                    exemplaire.setIdExemplaire(id);
                    return ResponseEntity.ok(service.save(exemplaire));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
