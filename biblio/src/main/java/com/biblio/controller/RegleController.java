package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Regle;
import com.biblio.service.RegleService;

@RestController
@RequestMapping("/regle")
public class RegleController {
    @Autowired
    private RegleService service;

    @GetMapping
    public List<Regle> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Regle findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Regle save(@RequestBody Regle obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
