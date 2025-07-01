package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.TypepretRepository;
import com.biblio.model.Typepret;

@Service
public class TypepretServiceImpl implements TypepretService {
    @Autowired
    private TypepretRepository repo;

    public List<Typepret> findAll() { return repo.findAll(); }
    public Typepret findById(Integer id) { return repo.findById(id).orElse(null); }
    public Typepret save(Typepret obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
