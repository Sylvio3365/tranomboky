package com.biblio.repository;

import com.biblio.model.Regle;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface RegleRepository extends JpaRepository<Regle, Integer> {
    List<Regle> findByDeleted_atIsNull();
    Optional<Regle> findByIdAndDeleted_atIsNull(Integer id);
}
