package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import java.time.*;
import com.biblio.repository.LivreRepository;
import com.biblio.model.Livre;

@Service
public class LivreServiceImpl implements LivreService {
    @Autowired
    private LivreRepository repo;

    public List<Livre> findAll() { return repo.findByDeleted_atIsNull(); }
    public Livre findById(Integer id) { return repo.findByIdAndDeleted_atIsNull(id).orElse(null); }
    public Livre save(Livre obj) { return repo.save(obj); }
    public void deleteById(Integer id) {
        Livre obj = repo.findById(id).orElse(null);
        if(obj != null) {
            obj.setDeleted_at(LocalDateTime.now());
            repo.save(obj);
        }
    }
}
