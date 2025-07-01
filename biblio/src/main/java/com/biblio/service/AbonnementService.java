package com.biblio.service;

import com.biblio.model.Abonnement;
import java.util.List;

public interface AbonnementService {
    List<Abonnement> findAll();
    Abonnement findById(Integer id);
    Abonnement save(Abonnement obj);
    void deleteById(Integer id);
}
