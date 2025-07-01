package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.HistoriqueStatutProlongementRepository;
import com.biblio.model.HistoriqueStatutProlongement;

@Service
public class HistoriqueStatutProlongementServiceImpl implements HistoriqueStatutProlongementService {
    @Autowired
    private HistoriqueStatutProlongementRepository repo;

    public List<HistoriqueStatutProlongement> findAll() { return repo.findAll(); }
    public HistoriqueStatutProlongement findById(Integer id) { return repo.findById(id).orElse(null); }
    public HistoriqueStatutProlongement save(HistoriqueStatutProlongement obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
