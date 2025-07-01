package com.biblio.service;

import com.biblio.model.AdherentAbonnementId;
import com.biblio.model.AdherentAbonnement;
import java.util.List;

public interface AdherentAbonnementService {
    List<AdherentAbonnement> findAll();
    AdherentAbonnement findById(AdherentAbonnementId id);
    AdherentAbonnement save(AdherentAbonnement obj);
    void deleteById(AdherentAbonnementId id);
}
