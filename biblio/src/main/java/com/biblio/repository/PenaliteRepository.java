package com.biblio.repository;

import com.biblio.model.Penalite;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface PenaliteRepository extends JpaRepository<Penalite, Integer> {
    List<Penalite> findByDeleted_atIsNull();
    Optional<Penalite> findByIdAndDeleted_atIsNull(Integer id);
}
