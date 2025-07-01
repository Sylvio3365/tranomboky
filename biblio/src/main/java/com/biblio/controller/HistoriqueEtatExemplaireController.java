package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.HistoriqueEtatExemplaire;
import com.biblio.service.HistoriqueEtatExemplaireService;

@RestController
@RequestMapping("/historique_etat_exemplaire")
public class HistoriqueEtatExemplaireController {
    @Autowired
    private HistoriqueEtatExemplaireService service;

    @GetMapping
    public List<HistoriqueEtatExemplaire> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public HistoriqueEtatExemplaire findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public HistoriqueEtatExemplaire save(@RequestBody HistoriqueEtatExemplaire obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
