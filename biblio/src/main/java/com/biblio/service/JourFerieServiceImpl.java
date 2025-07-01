package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.JourFerieRepository;
import com.biblio.model.JourFerie;

@Service
public class JourFerieServiceImpl implements JourFerieService {
    @Autowired
    private JourFerieRepository repo;

    public List<JourFerie> findAll() { return repo.findAll(); }
    public JourFerie findById(Integer id) { return repo.findById(id).orElse(null); }
    public JourFerie save(JourFerie obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
