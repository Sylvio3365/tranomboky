package com.biblio.service;

import com.biblio.model.Rendu;
import java.util.List;

public interface RenduService {
    List<Rendu> findAll();
    Rendu findById(Integer id);
    Rendu save(Rendu obj);
    void deleteById(Integer id);
}
