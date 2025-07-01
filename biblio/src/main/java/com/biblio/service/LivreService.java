package com.biblio.service;

import com.biblio.model.Livre;
import java.util.List;

public interface LivreService {
    List<Livre> findAll();
    Livre findById(Integer id);
    Livre save(Livre obj);
    void deleteById(Integer id);
}
