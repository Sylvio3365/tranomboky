package com.biblio.service;

import com.biblio.model.Adherent;
import java.util.List;

public interface AdherentService {
    List<Adherent> findAll();
    Adherent findById(Integer id);
    Adherent save(Adherent obj);
    void deleteById(Integer id);
}
