package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.LivreRestrictionRepository;
import com.biblio.model.LivreRestrictionId;
import com.biblio.model.LivreRestriction;

@Service
public class LivreRestrictionServiceImpl implements LivreRestrictionService {
    @Autowired
    private LivreRestrictionRepository repo;

    public List<LivreRestriction> findAll() { return repo.findAll(); }
    public LivreRestriction findById(LivreRestrictionId id) { return repo.findById(id).orElse(null); }
    public LivreRestriction save(LivreRestriction obj) { return repo.save(obj); }
    public void deleteById(LivreRestrictionId id) { repo.deleteById(id); }
}
