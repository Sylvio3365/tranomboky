package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.AdherentAbonnementId;
import com.biblio.model.AdherentAbonnement;
import com.biblio.service.AdherentAbonnementService;

@RestController
@RequestMapping("/adherent_abonnement")
public class AdherentAbonnementController {
    @Autowired
    private AdherentAbonnementService service;

    @GetMapping
    public List<AdherentAbonnement> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public AdherentAbonnement findById(@PathVariable AdherentAbonnementId id) { return service.findById(id); }
    @PostMapping
    public AdherentAbonnement save(@RequestBody AdherentAbonnement obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable AdherentAbonnementId id) { service.deleteById(id); }
}
