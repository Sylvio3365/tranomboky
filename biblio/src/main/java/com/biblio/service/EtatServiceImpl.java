package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.EtatRepository;
import com.biblio.model.Etat;

@Service
public class EtatServiceImpl implements EtatService {
    @Autowired
    private EtatRepository repo;

    public List<Etat> findAll() { return repo.findAll(); }
    public Etat findById(Integer id) { return repo.findById(id).orElse(null); }
    public Etat save(Etat obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
