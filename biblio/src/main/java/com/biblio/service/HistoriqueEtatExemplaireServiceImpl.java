package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.HistoriqueEtatExemplaireRepository;
import com.biblio.model.HistoriqueEtatExemplaire;

@Service
public class HistoriqueEtatExemplaireServiceImpl implements HistoriqueEtatExemplaireService {
    @Autowired
    private HistoriqueEtatExemplaireRepository repo;

    public List<HistoriqueEtatExemplaire> findAll() { return repo.findAll(); }
    public HistoriqueEtatExemplaire findById(Integer id) { return repo.findById(id).orElse(null); }
    public HistoriqueEtatExemplaire save(HistoriqueEtatExemplaire obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
