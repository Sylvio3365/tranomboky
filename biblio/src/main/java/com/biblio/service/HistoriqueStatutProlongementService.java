package com.biblio.service;

import com.biblio.model.HistoriqueStatutProlongement;
import java.util.List;

public interface HistoriqueStatutProlongementService {
    List<HistoriqueStatutProlongement> findAll();
    HistoriqueStatutProlongement findById(Integer id);
    HistoriqueStatutProlongement save(HistoriqueStatutProlongement obj);
    void deleteById(Integer id);
}
