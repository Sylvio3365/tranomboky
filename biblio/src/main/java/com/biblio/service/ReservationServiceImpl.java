package com.biblio.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.repository.ReservationRepository;
import com.biblio.model.Reservation;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationRepository repo;

    public List<Reservation> findAll() { return repo.findAll(); }
    public Reservation findById(Integer id) { return repo.findById(id).orElse(null); }
    public Reservation save(Reservation obj) { return repo.save(obj); }
    public void deleteById(Integer id) { repo.deleteById(id); }
}
