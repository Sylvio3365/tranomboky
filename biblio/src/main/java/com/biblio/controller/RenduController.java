package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Rendu;
import com.biblio.service.RenduService;

@RestController
@RequestMapping("/rendu")
public class RenduController {
    @Autowired
    private RenduService service;

    @GetMapping
    public List<Rendu> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Rendu findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Rendu save(@RequestBody Rendu obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
