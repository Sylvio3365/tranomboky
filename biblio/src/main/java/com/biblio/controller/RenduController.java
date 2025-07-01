package com.biblio.controller;

import com.biblio.model.Rendu;
import com.biblio.service.RenduService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rendus")
public class RenduController {
    private final RenduService service;

    public RenduController(RenduService service) {
        this.service = service;
    }

    @GetMapping
    public List<Rendu> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rendu> get(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Rendu create(@RequestBody Rendu rendu) {
        return service.save(rendu);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Rendu> update(@PathVariable Integer id, @RequestBody Rendu rendu) {
        return service.findById(id)
                .map(existing -> {
                    rendu.setIdRendu(id);
                    return ResponseEntity.ok(service.save(rendu));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
