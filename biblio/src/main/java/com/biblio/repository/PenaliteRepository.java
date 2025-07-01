package com.biblio.repository;

import com.biblio.model.Penalite;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface PenaliteRepository extends JpaRepository<Penalite, Integer> {
    List<Penalite> findByDeletedAtIsNull();
    Optional<Penalite> findByIdPenaliteAndDeletedAtIsNull(Integer idPenalite);
}
