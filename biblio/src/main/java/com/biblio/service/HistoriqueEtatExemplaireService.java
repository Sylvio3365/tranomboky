package com.biblio.service;

import com.biblio.model.HistoriqueEtatExemplaire;
import java.util.List;

public interface HistoriqueEtatExemplaireService {
    List<HistoriqueEtatExemplaire> findAll();
    HistoriqueEtatExemplaire findById(Integer id);
    HistoriqueEtatExemplaire save(HistoriqueEtatExemplaire obj);
    void deleteById(Integer id);
}
