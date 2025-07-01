package com.biblio.service;

import com.biblio.model.Reservation;
import java.util.List;

public interface ReservationService {
    List<Reservation> findAll();
    Reservation findById(Integer id);
    Reservation save(Reservation obj);
    void deleteById(Integer id);
}
