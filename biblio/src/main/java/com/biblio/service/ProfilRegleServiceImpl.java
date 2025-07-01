package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.ProfilRegleRepository;
import com.biblio.model.ProfilRegleId;
import com.biblio.model.ProfilRegle;

@Service
public class ProfilRegleServiceImpl implements ProfilRegleService {
    @Autowired
    private ProfilRegleRepository repo;

    public List<ProfilRegle> findAll() { return repo.findAll(); }
    public ProfilRegle findById(ProfilRegleId id) { return repo.findById(id).orElse(null); }
    public ProfilRegle save(ProfilRegle obj) { return repo.save(obj); }
    public void deleteById(ProfilRegleId id) { repo.deleteById(id); }
}
