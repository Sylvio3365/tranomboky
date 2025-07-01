package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.ExemplaireTypepretId;
import com.biblio.model.ExemplaireTypepret;
import com.biblio.service.ExemplaireTypepretService;

@RestController
@RequestMapping("/exemplaire_typepret")
public class ExemplaireTypepretController {
    @Autowired
    private ExemplaireTypepretService service;

    @GetMapping
    public List<ExemplaireTypepret> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public ExemplaireTypepret findById(@PathVariable ExemplaireTypepretId id) { return service.findById(id); }
    @PostMapping
    public ExemplaireTypepret save(@RequestBody ExemplaireTypepret obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ExemplaireTypepretId id) { service.deleteById(id); }
}
