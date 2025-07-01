package com.biblio.repository;

import com.biblio.model.Restriction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface RestrictionRepository extends JpaRepository<Restriction, Integer> {
    List<Restriction> findByDeleted_atIsNull();
    Optional<Restriction> findByIdAndDeleted_atIsNull(Integer id);
}
