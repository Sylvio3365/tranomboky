package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.HistoriqueStatutProlongement;
import com.biblio.service.HistoriqueStatutProlongementService;

@RestController
@RequestMapping("/historique_statut_prolongement")
public class HistoriqueStatutProlongementController {
    @Autowired
    private HistoriqueStatutProlongementService service;

    @GetMapping
    public List<HistoriqueStatutProlongement> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public HistoriqueStatutProlongement findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public HistoriqueStatutProlongement save(@RequestBody HistoriqueStatutProlongement obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
