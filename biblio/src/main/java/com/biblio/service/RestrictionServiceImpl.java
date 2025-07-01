package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.RestrictionRepository;
import com.biblio.model.Restriction;

@Service
public class RestrictionServiceImpl implements RestrictionService {
    @Autowired
    private RestrictionRepository repo;

    public List<Restriction> findAll() { return repo.findAll(); }
    public Restriction findById(Integer id) { return repo.findById(id).orElse(null); }
    public Restriction save(Restriction obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
