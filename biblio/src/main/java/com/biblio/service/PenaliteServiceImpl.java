package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.PenaliteRepository;
import com.biblio.model.Penalite;

@Service
public class PenaliteServiceImpl implements PenaliteService {
    @Autowired
    private PenaliteRepository repo;

    public List<Penalite> findAll() { return repo.findAll(); }
    public Penalite findById(Integer id) { return repo.findById(id).orElse(null); }
    public Penalite save(Penalite obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
