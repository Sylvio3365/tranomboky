package com.biblio.controller;

import com.biblio.model.Adherent;
import com.biblio.service.AdherentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/adherents")
public class AdherentController {
    private final AdherentService service;

    public AdherentController(AdherentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Adherent> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Adherent> get(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Adherent create(@RequestBody Adherent adherent) {
        return service.save(adherent);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Adherent> update(@PathVariable Integer id, @RequestBody Adherent adherent) {
        return service.findById(id)
                .map(existing -> {
                    adherent.setIdAdherent(id);
                    return ResponseEntity.ok(service.save(adherent));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
