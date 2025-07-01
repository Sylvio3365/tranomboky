package com.biblio.repository;

import com.biblio.model.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface AdherentRepository extends JpaRepository<Adherent, Integer> {
    List<Adherent> findByDeleted_atIsNull();
    Optional<Adherent> findByIdAndDeleted_atIsNull(Integer id);
}
