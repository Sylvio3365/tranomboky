package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.LivreRepository;
import com.biblio.model.Livre;

@Service
public class LivreServiceImpl implements LivreService {
    @Autowired
    private LivreRepository repo;

    public List<Livre> findAll() { return repo.findAll(); }
    public Livre findById(Integer id) { return repo.findById(id).orElse(null); }
    public Livre save(Livre obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
