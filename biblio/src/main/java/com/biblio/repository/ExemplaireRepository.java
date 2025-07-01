package com.biblio.repository;

import com.biblio.model.Exemplaire;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface ExemplaireRepository extends JpaRepository<Exemplaire, Integer> {
    List<Exemplaire> findByDeleted_atIsNull();
    Optional<Exemplaire> findByIdAndDeleted_atIsNull(Integer id);
}
