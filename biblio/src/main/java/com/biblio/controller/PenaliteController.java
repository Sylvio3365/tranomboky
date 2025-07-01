package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Penalite;
import com.biblio.service.PenaliteService;

@RestController
@RequestMapping("/penalite")
public class PenaliteController {
    @Autowired
    private PenaliteService service;

    @GetMapping
    public List<Penalite> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Penalite findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Penalite save(@RequestBody Penalite obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
