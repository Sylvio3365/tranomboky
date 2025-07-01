package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.SanctionRepository;
import com.biblio.model.Sanction;

@Service
public class SanctionServiceImpl implements SanctionService {
    @Autowired
    private SanctionRepository repo;

    public List<Sanction> findAll() { return repo.findAll(); }
    public Sanction findById(Integer id) { return repo.findById(id).orElse(null); }
    public Sanction save(Sanction obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
