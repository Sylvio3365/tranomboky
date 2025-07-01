package com.biblio.repository;

import com.biblio.model.AdherentAbonnement;
import com.biblio.model.AdherentAbonnementId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdherentAbonnementRepository extends JpaRepository<AdherentAbonnement, AdherentAbonnementId> {
}
