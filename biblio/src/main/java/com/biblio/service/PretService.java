package com.biblio.service;

import com.biblio.model.Pret;
import com.biblio.repository.PretRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PretService {
    private final PretRepository repository;

    public PretService(PretRepository repository) {
        this.repository = repository;
    }

    public List<Pret> findAll() {
        return repository.findAll();
    }

    public Optional<Pret> findById(Integer id) {
        return repository.findById(id);
    }

    public Pret save(Pret pret) {
        return repository.save(pret);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
