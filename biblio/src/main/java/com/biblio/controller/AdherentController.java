package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Adherent;
import com.biblio.service.AdherentService;

@RestController
@RequestMapping("/adherent")
public class AdherentController {
    @Autowired
    private AdherentService service;

    @GetMapping
    public List<Adherent> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Adherent findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Adherent save(@RequestBody Adherent obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
