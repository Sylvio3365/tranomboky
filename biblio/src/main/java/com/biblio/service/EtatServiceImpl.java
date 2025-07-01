package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import java.time.*;
import com.biblio.repository.EtatRepository;
import com.biblio.model.Etat;

@Service
public class EtatServiceImpl implements EtatService {
    @Autowired
    private EtatRepository repo;

    public List<Etat> findAll() {
        return repo.findAll().stream()
                .filter(e -> e.getDeleted_at() == null)
                .toList();
    }

    public Etat findById(Integer id) {
        return repo.findById(id)
                .filter(e -> e.getDeleted_at() == null)
                .orElse(null);
    }
    public Etat save(Etat obj) { return repo.save(obj); }
    public void deleteById(Integer id) {
        Etat obj = repo.findById(id).orElse(null);
        if(obj != null) {
            obj.setDeleted_at(LocalDateTime.now());
            repo.save(obj);
        }
    }
}
