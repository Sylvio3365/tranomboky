package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Exemplaire;
import com.biblio.service.ExemplaireService;

@RestController
@RequestMapping("/exemplaire")
public class ExemplaireController {
    @Autowired
    private ExemplaireService service;

    @GetMapping
    public List<Exemplaire> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Exemplaire findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Exemplaire save(@RequestBody Exemplaire obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
