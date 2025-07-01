package com.biblio.service;

import com.biblio.model.Livre;
import com.biblio.repository.LivreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivreService {
    private final LivreRepository repository;

    public LivreService(LivreRepository repository) {
        this.repository = repository;
    }

    public List<Livre> findAll() {
        return repository.findAll();
    }

    public Optional<Livre> findById(Integer id) {
        return repository.findById(id);
    }

    public Livre save(Livre livre) {
        return repository.save(livre);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
