package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import java.time.*;
import com.biblio.repository.RoleRepository;
import com.biblio.model.Role;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository repo;

    public List<Role> findAll() {
        return repo.findAll().stream()
                .filter(r -> r.getDeleted_at() == null)
                .toList();
    }

    public Role findById(Integer id) {
        return repo.findById(id)
                .filter(r -> r.getDeleted_at() == null)
                .orElse(null);
    }
    public Role save(Role obj) { return repo.save(obj); }
    public void deleteById(Integer id) {
        Role obj = repo.findById(id).orElse(null);
        if(obj != null) {
            obj.setDeleted_at(LocalDateTime.now());
            repo.save(obj);
        }
    }
}
