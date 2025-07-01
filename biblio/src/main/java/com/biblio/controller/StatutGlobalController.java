package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.StatutGlobal;
import com.biblio.service.StatutGlobalService;

@RestController
@RequestMapping("/statut_global")
public class StatutGlobalController {
    @Autowired
    private StatutGlobalService service;

    @GetMapping
    public List<StatutGlobal> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public StatutGlobal findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public StatutGlobal save(@RequestBody StatutGlobal obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
