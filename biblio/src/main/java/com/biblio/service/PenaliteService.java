package com.biblio.service;

import com.biblio.model.Penalite;
import java.util.List;

public interface PenaliteService {
    List<Penalite> findAll();
    Penalite findById(Integer id);
    Penalite save(Penalite obj);
    void deleteById(Integer id);
}
