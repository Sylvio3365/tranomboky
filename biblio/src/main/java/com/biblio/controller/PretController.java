package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Pret;
import com.biblio.service.PretService;

@RestController
@RequestMapping("/pret")
public class PretController {
    @Autowired
    private PretService service;

    @GetMapping
    public List<Pret> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Pret findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Pret save(@RequestBody Pret obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
