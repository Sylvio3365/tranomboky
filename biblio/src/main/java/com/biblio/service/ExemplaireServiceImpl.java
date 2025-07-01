package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.ExemplaireRepository;
import com.biblio.model.Exemplaire;

@Service
public class ExemplaireServiceImpl implements ExemplaireService {
    @Autowired
    private ExemplaireRepository repo;

    public List<Exemplaire> findAll() { return repo.findAll(); }
    public Exemplaire findById(Integer id) { return repo.findById(id).orElse(null); }
    public Exemplaire save(Exemplaire obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
