package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Etat;
import com.biblio.service.EtatService;

@RestController
@RequestMapping("/etat")
public class EtatController {
    @Autowired
    private EtatService service;

    @GetMapping
    public List<Etat> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Etat findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Etat save(@RequestBody Etat obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
