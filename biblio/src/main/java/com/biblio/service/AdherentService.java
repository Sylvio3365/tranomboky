package com.biblio.service;

import com.biblio.model.Adherent;
import com.biblio.repository.AdherentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdherentService {
    private final AdherentRepository repository;

    public AdherentService(AdherentRepository repository) {
        this.repository = repository;
    }

    public List<Adherent> findAll() {
        return repository.findAll();
    }

    public Optional<Adherent> findById(Integer id) {
        return repository.findById(id);
    }

    public Adherent save(Adherent adherent) {
        return repository.save(adherent);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
