package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.StatutRepository;
import com.biblio.model.Statut;

@Service
public class StatutServiceImpl implements StatutService {
    @Autowired
    private StatutRepository repo;

    public List<Statut> findAll() { return repo.findAll(); }
    public Statut findById(Integer id) { return repo.findById(id).orElse(null); }
    public Statut save(Statut obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
