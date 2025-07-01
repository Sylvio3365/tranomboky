package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import java.time.*;
import com.biblio.repository.RegleRepository;
import com.biblio.model.Regle;

@Service
public class RegleServiceImpl implements RegleService {
    @Autowired
    private RegleRepository repo;

    public List<Regle> findAll() {
        return repo.findAll().stream()
                .filter(r -> r.getDatedelete() == null)
                .toList();
    }

    public Regle findById(Integer id) {
        return repo.findById(id)
                .filter(r -> r.getDatedelete() == null)
                .orElse(null);
    }
    public Regle save(Regle obj) { return repo.save(obj); }
    public void deleteById(Integer id) {
        Regle obj = repo.findById(id).orElse(null);
        if(obj != null) {
            obj.setDatedelete(LocalDateTime.now());
            repo.save(obj);
        }
    }
}
