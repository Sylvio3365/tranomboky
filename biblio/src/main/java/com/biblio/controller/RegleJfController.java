package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.RegleJf;
import com.biblio.service.RegleJfService;

@RestController
@RequestMapping("/regle_jf")
public class RegleJfController {
    @Autowired
    private RegleJfService service;

    @GetMapping
    public List<RegleJf> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public RegleJf findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public RegleJf save(@RequestBody RegleJf obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
