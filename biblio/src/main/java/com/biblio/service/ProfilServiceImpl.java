package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.ProfilRepository;
import com.biblio.model.Profil;

@Service
public class ProfilServiceImpl implements ProfilService {
    @Autowired
    private ProfilRepository repo;

    public List<Profil> findAll() { return repo.findAll(); }
    public Profil findById(Integer id) { return repo.findById(id).orElse(null); }
    public Profil save(Profil obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
