package com.biblio.service;

import com.biblio.model.Exemplaire;
import com.biblio.repository.ExemplaireRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExemplaireService {
    private final ExemplaireRepository repository;

    public ExemplaireService(ExemplaireRepository repository) {
        this.repository = repository;
    }

    public List<Exemplaire> findAll() {
        return repository.findAll();
    }

    public Optional<Exemplaire> findById(Integer id) {
        return repository.findById(id);
    }

    public Exemplaire save(Exemplaire exemplaire) {
        return repository.save(exemplaire);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
