package com.biblio.controller;

import com.biblio.model.Pret;
import com.biblio.service.PretService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prets")
public class PretController {
    private final PretService service;

    public PretController(PretService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pret> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pret> get(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Pret create(@RequestBody Pret pret) {
        return service.save(pret);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pret> update(@PathVariable Integer id, @RequestBody Pret pret) {
        return service.findById(id)
                .map(existing -> {
                    pret.setIdPret(id);
                    return ResponseEntity.ok(service.save(pret));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
