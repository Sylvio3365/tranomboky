package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.ProlongementRepository;
import com.biblio.model.Prolongement;

@Service
public class ProlongementServiceImpl implements ProlongementService {
    @Autowired
    private ProlongementRepository repo;

    public List<Prolongement> findAll() { return repo.findAll(); }
    public Prolongement findById(Integer id) { return repo.findById(id).orElse(null); }
    public Prolongement save(Prolongement obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
