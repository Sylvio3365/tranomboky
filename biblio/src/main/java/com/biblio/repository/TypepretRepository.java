package com.biblio.repository;

import com.biblio.model.Typepret;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface TypepretRepository extends JpaRepository<Typepret, Integer> {
    List<Typepret> findByDatedeleteIsNull();
    Optional<Typepret> findByIdTypePretAndDatedeleteIsNull(Integer idTypePret);
}
