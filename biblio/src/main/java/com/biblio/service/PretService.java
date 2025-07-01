package com.biblio.service;

import com.biblio.model.Pret;
import java.util.List;

public interface PretService {
    List<Pret> findAll();
    Pret findById(Integer id);
    Pret save(Pret obj);
    void deleteById(Integer id);
}
