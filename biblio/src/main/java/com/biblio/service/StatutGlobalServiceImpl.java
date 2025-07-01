package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.StatutGlobalRepository;
import com.biblio.model.StatutGlobal;

@Service
public class StatutGlobalServiceImpl implements StatutGlobalService {
    @Autowired
    private StatutGlobalRepository repo;

    public List<StatutGlobal> findAll() { return repo.findAll(); }
    public StatutGlobal findById(Integer id) { return repo.findById(id).orElse(null); }
    public StatutGlobal save(StatutGlobal obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
