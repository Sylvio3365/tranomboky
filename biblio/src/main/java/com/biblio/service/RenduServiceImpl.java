package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.RenduRepository;
import com.biblio.model.Rendu;

@Service
public class RenduServiceImpl implements RenduService {
    @Autowired
    private RenduRepository repo;

    public List<Rendu> findAll() { return repo.findAll(); }
    public Rendu findById(Integer id) { return repo.findById(id).orElse(null); }
    public Rendu save(Rendu obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
