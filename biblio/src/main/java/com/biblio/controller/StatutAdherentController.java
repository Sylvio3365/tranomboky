package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.StatutAdherent;
import com.biblio.service.StatutAdherentService;

@RestController
@RequestMapping("/statut_adherent")
public class StatutAdherentController {
    @Autowired
    private StatutAdherentService service;

    @GetMapping
    public List<StatutAdherent> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public StatutAdherent findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public StatutAdherent save(@RequestBody StatutAdherent obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
