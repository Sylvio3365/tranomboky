package com.biblio.service;

import com.biblio.model.HistoriqueStatutReservation;
import java.util.List;

public interface HistoriqueStatutReservationService {
    List<HistoriqueStatutReservation> findAll();
    HistoriqueStatutReservation findById(Integer id);
    HistoriqueStatutReservation save(HistoriqueStatutReservation obj);
    void deleteById(Integer id);
}
