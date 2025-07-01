package com.biblio.service;

import com.biblio.model.Abonnement;
import com.biblio.repository.AbonnementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AbonnementService {
    private final AbonnementRepository repository;

    public AbonnementService(AbonnementRepository repository) {
        this.repository = repository;
    }

    public List<Abonnement> findAll() {
        return repository.findAll();
    }

    public Optional<Abonnement> findById(Integer id) {
        return repository.findById(id);
    }

    public Abonnement save(Abonnement abonnement) {
        return repository.save(abonnement);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
