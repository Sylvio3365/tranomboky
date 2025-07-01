package com.biblio.repository;

import com.biblio.model.Etat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtatRepository extends JpaRepository<Etat, Integer> {
}
