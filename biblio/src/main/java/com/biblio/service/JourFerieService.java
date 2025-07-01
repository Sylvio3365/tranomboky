package com.biblio.service;

import com.biblio.model.JourFerie;
import java.util.List;

public interface JourFerieService {
    List<JourFerie> findAll();
    JourFerie findById(Integer id);
    JourFerie save(JourFerie obj);
    void deleteById(Integer id);
}
