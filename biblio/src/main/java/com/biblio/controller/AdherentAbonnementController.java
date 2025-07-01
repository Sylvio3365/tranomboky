package com.biblio.controller;

import com.biblio.model.AdherentAbonnement;
import com.biblio.service.AdherentAbonnementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/adherentAbonnements")
public class AdherentAbonnementController {
    private final AdherentAbonnementService service;

    public AdherentAbonnementController(AdherentAbonnementService service) {
        this.service = service;
    }

    @GetMapping
    public List<AdherentAbonnement> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdherentAbonnement> get(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public AdherentAbonnement create(@RequestBody AdherentAbonnement aa) {
        return service.save(aa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AdherentAbonnement> update(@PathVariable Integer id, @RequestBody AdherentAbonnement aa) {
        return service.findById(id)
                .map(existing -> {
                    aa.setId(id);
                    return ResponseEntity.ok(service.save(aa));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
