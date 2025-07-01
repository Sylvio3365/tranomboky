package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.AbonnementRepository;
import com.biblio.model.Abonnement;

@Service
public class AbonnementServiceImpl implements AbonnementService {
    @Autowired
    private AbonnementRepository repo;

    public List<Abonnement> findAll() { return repo.findAll(); }
    public Abonnement findById(Integer id) { return repo.findById(id).orElse(null); }
    public Abonnement save(Abonnement obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
