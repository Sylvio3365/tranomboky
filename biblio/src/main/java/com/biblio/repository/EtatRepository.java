package com.biblio.repository;

import com.biblio.model.Etat;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface EtatRepository extends JpaRepository<Etat, Integer> {
    List<Etat> findByDeleted_atIsNull();
    Optional<Etat> findByIdAndDeleted_atIsNull(Integer id);
}
