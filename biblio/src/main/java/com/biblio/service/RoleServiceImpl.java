package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.RoleRepository;
import com.biblio.model.Role;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository repo;

    public List<Role> findAll() { return repo.findAll(); }
    public Role findById(Integer id) { return repo.findById(id).orElse(null); }
    public Role save(Role obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
