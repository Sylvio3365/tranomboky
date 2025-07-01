package com.biblio.controller;

import com.biblio.model.Profil;
import com.biblio.service.ProfilService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profils")
public class ProfilController {
    private final ProfilService service;

    public ProfilController(ProfilService service) {
        this.service = service;
    }

    @GetMapping
    public List<Profil> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profil> get(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Profil create(@RequestBody Profil profil) {
        return service.save(profil);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Profil> update(@PathVariable Integer id, @RequestBody Profil profil) {
        return service.findById(id)
                .map(existing -> {
                    profil.setIdProfil(id);
                    return ResponseEntity.ok(service.save(profil));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
