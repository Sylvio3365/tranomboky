package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Restriction;
import com.biblio.service.RestrictionService;

@RestController
@RequestMapping("/restriction")
public class RestrictionController {
    @Autowired
    private RestrictionService service;

    @GetMapping
    public List<Restriction> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Restriction findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Restriction save(@RequestBody Restriction obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
