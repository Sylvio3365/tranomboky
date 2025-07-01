package com.biblio.service;

import com.biblio.model.Rendu;
import com.biblio.repository.RenduRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RenduService {
    private final RenduRepository repository;

    public RenduService(RenduRepository repository) {
        this.repository = repository;
    }

    public List<Rendu> findAll() {
        return repository.findAll();
    }

    public Optional<Rendu> findById(Integer id) {
        return repository.findById(id);
    }

    public Rendu save(Rendu rendu) {
        return repository.save(rendu);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
