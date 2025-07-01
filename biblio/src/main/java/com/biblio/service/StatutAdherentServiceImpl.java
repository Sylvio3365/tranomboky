package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.StatutAdherentRepository;
import com.biblio.model.StatutAdherent;

@Service
public class StatutAdherentServiceImpl implements StatutAdherentService {
    @Autowired
    private StatutAdherentRepository repo;

    public List<StatutAdherent> findAll() { return repo.findAll(); }
    public StatutAdherent findById(Integer id) { return repo.findById(id).orElse(null); }
    public StatutAdherent save(StatutAdherent obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
