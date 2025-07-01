package com.biblio.service;

import com.biblio.model.AdherentAbonnement;
import com.biblio.repository.AdherentAbonnementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdherentAbonnementService {
    private final AdherentAbonnementRepository repository;

    public AdherentAbonnementService(AdherentAbonnementRepository repository) {
        this.repository = repository;
    }

    public List<AdherentAbonnement> findAll() {
        return repository.findAll();
    }

    public Optional<AdherentAbonnement> findById(Integer id) {
        return repository.findById(id);
    }

    public AdherentAbonnement save(AdherentAbonnement aa) {
        return repository.save(aa);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
