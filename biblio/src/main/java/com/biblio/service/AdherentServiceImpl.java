package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.AdherentRepository;
import com.biblio.model.Adherent;

@Service
public class AdherentServiceImpl implements AdherentService {
    @Autowired
    private AdherentRepository repo;

    public List<Adherent> findAll() { return repo.findAll(); }
    public Adherent findById(Integer id) { return repo.findById(id).orElse(null); }
    public Adherent save(Adherent obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
