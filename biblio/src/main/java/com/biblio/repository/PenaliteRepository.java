package com.biblio.repository;

import com.biblio.model.Penalite;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface PenaliteRepository extends JpaRepository<Penalite, Integer> {
    List<Penalite> findByDatedeleteIsNull();
    Optional<Penalite> findById_penaliteAndDatedeleteIsNull(Integer id_penalite);
}
