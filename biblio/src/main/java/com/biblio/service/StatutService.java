package com.biblio.service;

import com.biblio.model.Statut;
import java.util.List;

public interface StatutService {
    List<Statut> findAll();
    Statut findById(Integer id);
    Statut save(Statut obj);
    void deleteById(Integer id);
}
