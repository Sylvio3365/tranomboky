package com.biblio.controller;

import com.biblio.model.Abonnement;
import com.biblio.service.AbonnementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/abonnements")
public class AbonnementController {
    private final AbonnementService service;

    public AbonnementController(AbonnementService service) {
        this.service = service;
    }

    @GetMapping
    public List<Abonnement> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Abonnement> get(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Abonnement create(@RequestBody Abonnement abonnement) {
        return service.save(abonnement);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Abonnement> update(@PathVariable Integer id, @RequestBody Abonnement abonnement) {
        return service.findById(id)
                .map(existing -> {
                    abonnement.setIdAbonnement(id);
                    return ResponseEntity.ok(service.save(abonnement));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
