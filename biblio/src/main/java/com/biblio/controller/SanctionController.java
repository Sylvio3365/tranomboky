package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Sanction;
import com.biblio.service.SanctionService;

@RestController
@RequestMapping("/sanction")
public class SanctionController {
    @Autowired
    private SanctionService service;

    @GetMapping
    public List<Sanction> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Sanction findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Sanction save(@RequestBody Sanction obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
