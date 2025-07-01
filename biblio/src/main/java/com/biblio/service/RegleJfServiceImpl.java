package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.RegleJfRepository;
import com.biblio.model.RegleJf;

@Service
public class RegleJfServiceImpl implements RegleJfService {
    @Autowired
    private RegleJfRepository repo;

    public List<RegleJf> findAll() { return repo.findAll(); }
    public RegleJf findById(Integer id) { return repo.findById(id).orElse(null); }
    public RegleJf save(RegleJf obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
