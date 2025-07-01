package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.JourFerie;
import com.biblio.service.JourFerieService;

@RestController
@RequestMapping("/jour_ferie")
public class JourFerieController {
    @Autowired
    private JourFerieService service;

    @GetMapping
    public List<JourFerie> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public JourFerie findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public JourFerie save(@RequestBody JourFerie obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
