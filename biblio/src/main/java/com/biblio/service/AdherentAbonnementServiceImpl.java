package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.AdherentAbonnementRepository;
import com.biblio.model.AdherentAbonnementId;
import com.biblio.model.AdherentAbonnement;

@Service
public class AdherentAbonnementServiceImpl implements AdherentAbonnementService {
    @Autowired
    private AdherentAbonnementRepository repo;

    public List<AdherentAbonnement> findAll() { return repo.findAll(); }
    public AdherentAbonnement findById(AdherentAbonnementId id) { return repo.findById(id).orElse(null); }
    public AdherentAbonnement save(AdherentAbonnement obj) { return repo.save(obj); }
    public void deleteById(AdherentAbonnementId id) { repo.deleteById(id); }
}
