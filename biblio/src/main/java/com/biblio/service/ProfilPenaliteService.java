package com.biblio.service;

import com.biblio.model.ProfilPenalite;
import java.util.List;

public interface ProfilPenaliteService {
    List<ProfilPenalite> findAll();
    ProfilPenalite findById(Integer id);
    ProfilPenalite save(ProfilPenalite obj);
    void deleteById(Integer id);
}
