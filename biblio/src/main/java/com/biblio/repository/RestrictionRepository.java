package com.biblio.repository;

import com.biblio.model.Restriction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface RestrictionRepository extends JpaRepository<Restriction, Integer> {
    List<Restriction> findByDatedeleteIsNull();
    Optional<Restriction> findByIdRestrictionAndDatedeleteIsNull(Integer idRestriction);
}
