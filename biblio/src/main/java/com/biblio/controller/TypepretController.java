package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Typepret;
import com.biblio.service.TypepretService;

@RestController
@RequestMapping("/typepret")
public class TypepretController {
    @Autowired
    private TypepretService service;

    @GetMapping
    public List<Typepret> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Typepret findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Typepret save(@RequestBody Typepret obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
