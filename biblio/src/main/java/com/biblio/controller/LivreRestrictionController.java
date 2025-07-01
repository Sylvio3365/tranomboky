package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.LivreRestrictionId;
import com.biblio.model.LivreRestriction;
import com.biblio.service.LivreRestrictionService;

@RestController
@RequestMapping("/livre_restriction")
public class LivreRestrictionController {
    @Autowired
    private LivreRestrictionService service;

    @GetMapping
    public List<LivreRestriction> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public LivreRestriction findById(@PathVariable LivreRestrictionId id) { return service.findById(id); }
    @PostMapping
    public LivreRestriction save(@RequestBody LivreRestriction obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable LivreRestrictionId id) { service.deleteById(id); }
}
