package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.PretRepository;
import com.biblio.model.Pret;

@Service
public class PretServiceImpl implements PretService {
    @Autowired
    private PretRepository repo;

    public List<Pret> findAll() { return repo.findAll(); }
    public Pret findById(Integer id) { return repo.findById(id).orElse(null); }
    public Pret save(Pret obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
