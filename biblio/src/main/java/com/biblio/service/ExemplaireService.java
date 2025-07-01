package com.biblio.service;

import com.biblio.model.Exemplaire;
import java.util.List;

public interface ExemplaireService {
    List<Exemplaire> findAll();
    Exemplaire findById(Integer id);
    Exemplaire save(Exemplaire obj);
    void deleteById(Integer id);
}
