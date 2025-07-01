package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import java.time.*;
import com.biblio.repository.ExemplaireRepository;
import com.biblio.model.Exemplaire;

@Service
public class ExemplaireServiceImpl implements ExemplaireService {
    @Autowired
    private ExemplaireRepository repo;

    public List<Exemplaire> findAll() {
        return repo.findAll().stream()
                .filter(e -> e.getDatedelete() == null)
                .toList();
    }

    public Exemplaire findById(Integer id) {
        return repo.findById(id)
                .filter(e -> e.getDatedelete() == null)
                .orElse(null);
    }
    public Exemplaire save(Exemplaire obj) { return repo.save(obj); }
    public void deleteById(Integer id) {
        Exemplaire obj = repo.findById(id).orElse(null);
        if(obj != null) {
            obj.setDatedelete(LocalDateTime.now());
            repo.save(obj);
        }
    }
}
