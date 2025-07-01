package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.ExemplaireTypepretRepository;
import com.biblio.model.ExemplaireTypepretId;
import com.biblio.model.ExemplaireTypepret;

@Service
public class ExemplaireTypepretServiceImpl implements ExemplaireTypepretService {
    @Autowired
    private ExemplaireTypepretRepository repo;

    public List<ExemplaireTypepret> findAll() { return repo.findAll(); }
    public ExemplaireTypepret findById(ExemplaireTypepretId id) { return repo.findById(id).orElse(null); }
    public ExemplaireTypepret save(ExemplaireTypepret obj) { return repo.save(obj); }
    public void deleteById(ExemplaireTypepretId id) { repo.deleteById(id); }
}
