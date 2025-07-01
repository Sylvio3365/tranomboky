package com.biblio.service;

import com.biblio.model.Profil;
import com.biblio.repository.ProfilRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfilService {
    private final ProfilRepository repository;

    public ProfilService(ProfilRepository repository) {
        this.repository = repository;
    }

    public List<Profil> findAll() {
        return repository.findAll();
    }

    public Optional<Profil> findById(Integer id) {
        return repository.findById(id);
    }

    public Profil save(Profil profil) {
        return repository.save(profil);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
