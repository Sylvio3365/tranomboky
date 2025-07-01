package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Abonnement;
import com.biblio.service.AbonnementService;

@RestController
@RequestMapping("/abonnement")
public class AbonnementController {
    @Autowired
    private AbonnementService service;

    @GetMapping
    public List<Abonnement> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Abonnement findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Abonnement save(@RequestBody Abonnement obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
