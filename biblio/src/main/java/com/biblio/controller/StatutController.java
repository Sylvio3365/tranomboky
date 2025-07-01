package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Statut;
import com.biblio.service.StatutService;

@RestController
@RequestMapping("/statut")
public class StatutController {
    @Autowired
    private StatutService service;

    @GetMapping
    public List<Statut> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Statut findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Statut save(@RequestBody Statut obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
