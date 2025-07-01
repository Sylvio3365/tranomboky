package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.HistoriqueStatutReservationRepository;
import com.biblio.model.HistoriqueStatutReservation;

@Service
public class HistoriqueStatutReservationServiceImpl implements HistoriqueStatutReservationService {
    @Autowired
    private HistoriqueStatutReservationRepository repo;

    public List<HistoriqueStatutReservation> findAll() { return repo.findAll(); }
    public HistoriqueStatutReservation findById(Integer id) { return repo.findById(id).orElse(null); }
    public HistoriqueStatutReservation save(HistoriqueStatutReservation obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
