package com.biblio.service;

import com.biblio.model.Utilisateur;
import com.biblio.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {
    private final UtilisateurRepository repository;

    public UtilisateurService(UtilisateurRepository repository) {
        this.repository = repository;
    }

    public List<Utilisateur> findAll() {
        return repository.findAll();
    }

    public Optional<Utilisateur> findById(Integer id) {
        return repository.findById(id);
    }

    public Utilisateur save(Utilisateur utilisateur) {
        return repository.save(utilisateur);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
