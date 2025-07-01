package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import java.time.*;
import com.biblio.repository.RestrictionRepository;
import com.biblio.model.Restriction;

@Service
public class RestrictionServiceImpl implements RestrictionService {
    @Autowired
    private RestrictionRepository repo;

    public List<Restriction> findAll() {
        return repo.findAll().stream()
                .filter(r -> r.getDeleted_at() == null)
                .toList();
    }

    public Restriction findById(Integer id) {
        return repo.findById(id)
                .filter(r -> r.getDeleted_at() == null)
                .orElse(null);
    }
    public Restriction save(Restriction obj) { return repo.save(obj); }
    public void deleteById(Integer id) {
        Restriction obj = repo.findById(id).orElse(null);
        if(obj != null) {
            obj.setDeleted_at(LocalDateTime.now());
            repo.save(obj);
        }
    }
}
