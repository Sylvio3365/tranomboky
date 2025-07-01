package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.ProfilPenaliteRepository;
import com.biblio.model.ProfilPenalite;

@Service
public class ProfilPenaliteServiceImpl implements ProfilPenaliteService {
    @Autowired
    private ProfilPenaliteRepository repo;

    public List<ProfilPenalite> findAll() { return repo.findAll(); }
    public ProfilPenalite findById(Integer id) { return repo.findById(id).orElse(null); }
    public ProfilPenalite save(ProfilPenalite obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
