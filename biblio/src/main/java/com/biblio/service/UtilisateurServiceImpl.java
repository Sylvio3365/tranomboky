package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import java.time.*;
import com.biblio.repository.UtilisateurRepository;
import com.biblio.model.Utilisateur;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    private UtilisateurRepository repo;

    public List<Utilisateur> findAll() { return repo.findByDeleted_atIsNull(); }
    public Utilisateur findById(Integer id) { return repo.findByIdAndDeleted_atIsNull(id).orElse(null); }
    public Utilisateur save(Utilisateur obj) { return repo.save(obj); }
    public void deleteById(Integer id) {
        Utilisateur obj = repo.findById(id).orElse(null);
        if(obj != null) {
            obj.setDeleted_at(LocalDateTime.now());
            repo.save(obj);
        }
    }
}
