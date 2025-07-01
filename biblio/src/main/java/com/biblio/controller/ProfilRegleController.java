package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.ProfilRegleId;
import com.biblio.model.ProfilRegle;
import com.biblio.service.ProfilRegleService;

@RestController
@RequestMapping("/profil_regle")
public class ProfilRegleController {
    @Autowired
    private ProfilRegleService service;

    @GetMapping
    public List<ProfilRegle> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public ProfilRegle findById(@PathVariable ProfilRegleId id) { return service.findById(id); }
    @PostMapping
    public ProfilRegle save(@RequestBody ProfilRegle obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ProfilRegleId id) { service.deleteById(id); }
}
