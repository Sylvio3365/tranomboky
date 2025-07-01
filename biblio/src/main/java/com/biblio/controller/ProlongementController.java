package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Prolongement;
import com.biblio.service.ProlongementService;

@RestController
@RequestMapping("/prolongement")
public class ProlongementController {
    @Autowired
    private ProlongementService service;

    @GetMapping
    public List<Prolongement> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Prolongement findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Prolongement save(@RequestBody Prolongement obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
