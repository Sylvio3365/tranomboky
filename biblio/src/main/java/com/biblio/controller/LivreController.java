package com.biblio.controller;

import com.biblio.model.Livre;
import com.biblio.service.LivreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livres")
public class LivreController {
    private final LivreService service;

    public LivreController(LivreService service) {
        this.service = service;
    }

    @GetMapping
    public List<Livre> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livre> get(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Livre create(@RequestBody Livre livre) {
        return service.save(livre);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livre> update(@PathVariable Integer id, @RequestBody Livre livre) {
        return service.findById(id)
                .map(existing -> {
                    livre.setIdLivre(id);
                    return ResponseEntity.ok(service.save(livre));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
