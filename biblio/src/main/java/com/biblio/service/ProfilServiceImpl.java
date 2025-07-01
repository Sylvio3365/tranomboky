package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import java.time.*;
import com.biblio.repository.ProfilRepository;
import com.biblio.model.Profil;

@Service
public class ProfilServiceImpl implements ProfilService {
    @Autowired
    private ProfilRepository repo;

    public List<Profil> findAll() {
        return repo.findAll().stream()
                .filter(p -> p.getDeleted_at() == null)
                .toList();
    }

    public Profil findById(Integer id) {
        return repo.findById(id)
                .filter(p -> p.getDeleted_at() == null)
                .orElse(null);
    }
    public Profil save(Profil obj) { return repo.save(obj); }
    public void deleteById(Integer id) {
        Profil obj = repo.findById(id).orElse(null);
        if(obj != null) {
            obj.setDeleted_at(LocalDateTime.now());
            repo.save(obj);
        }
    }
}
