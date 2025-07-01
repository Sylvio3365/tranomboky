package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Profil;
import com.biblio.service.ProfilService;

@RestController
@RequestMapping("/profil")
public class ProfilController {
    @Autowired
    private ProfilService service;

    @GetMapping
    public List<Profil> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Profil findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Profil save(@RequestBody Profil obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
