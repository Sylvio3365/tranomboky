package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Livre;
import com.biblio.service.LivreService;

@RestController
@RequestMapping("/livre")
public class LivreController {
    @Autowired
    private LivreService service;

    @GetMapping
    public List<Livre> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Livre findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Livre save(@RequestBody Livre obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
