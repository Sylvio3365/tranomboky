package com.biblio.service;

import com.biblio.model.Etat;
import java.util.List;

public interface EtatService {
    List<Etat> findAll();
    Etat findById(Integer id);
    Etat save(Etat obj);
    void deleteById(Integer id);
}
