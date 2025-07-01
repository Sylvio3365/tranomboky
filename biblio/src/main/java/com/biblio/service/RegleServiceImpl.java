package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.RegleRepository;
import com.biblio.model.Regle;

@Service
public class RegleServiceImpl implements RegleService {
    @Autowired
    private RegleRepository repo;

    public List<Regle> findAll() { return repo.findAll(); }
    public Regle findById(Integer id) { return repo.findById(id).orElse(null); }
    public Regle save(Regle obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
