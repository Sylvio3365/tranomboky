package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Utilisateur;
import com.biblio.service.UtilisateurService;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {
    @Autowired
    private UtilisateurService service;

    @GetMapping
    public List<Utilisateur> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Utilisateur findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Utilisateur save(@RequestBody Utilisateur obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
