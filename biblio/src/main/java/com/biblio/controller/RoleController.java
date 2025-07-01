package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.Role;
import com.biblio.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService service;

    @GetMapping
    public List<Role> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public Role findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public Role save(@RequestBody Role obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
