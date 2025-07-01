package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.ProfilPenalite;
import com.biblio.service.ProfilPenaliteService;

@RestController
@RequestMapping("/profil_penalite")
public class ProfilPenaliteController {
    @Autowired
    private ProfilPenaliteService service;

    @GetMapping
    public List<ProfilPenalite> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public ProfilPenalite findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public ProfilPenalite save(@RequestBody ProfilPenalite obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
