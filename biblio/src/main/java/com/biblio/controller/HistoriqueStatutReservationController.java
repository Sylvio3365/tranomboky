package com.biblio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.biblio.model.HistoriqueStatutReservation;
import com.biblio.service.HistoriqueStatutReservationService;

@RestController
@RequestMapping("/historique_statut_reservation")
public class HistoriqueStatutReservationController {
    @Autowired
    private HistoriqueStatutReservationService service;

    @GetMapping
    public List<HistoriqueStatutReservation> findAll() { return service.findAll(); }
    @GetMapping("/{id}")
    public HistoriqueStatutReservation findById(@PathVariable Integer id) { return service.findById(id); }
    @PostMapping
    public HistoriqueStatutReservation save(@RequestBody HistoriqueStatutReservation obj) { return service.save(obj); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.deleteById(id); }
}
