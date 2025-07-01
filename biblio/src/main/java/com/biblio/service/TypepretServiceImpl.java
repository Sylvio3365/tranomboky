package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import java.time.*;
import com.biblio.repository.TypepretRepository;
import com.biblio.model.Typepret;

@Service
public class TypepretServiceImpl implements TypepretService {
    @Autowired
    private TypepretRepository repo;

    public List<Typepret> findAll() {
        return repo.findAll().stream()
                .filter(t -> t.getDeleted_at() == null)
                .toList();
    }

    public Typepret findById(Integer id) {
        return repo.findById(id)
                .filter(t -> t.getDeleted_at() == null)
                .orElse(null);
    }
    public Typepret save(Typepret obj) { return repo.save(obj); }
    public void deleteById(Integer id) {
        Typepret obj = repo.findById(id).orElse(null);
        if(obj != null) {
            obj.setDeleted_at(LocalDateTime.now());
            repo.save(obj);
        }
    }
}
