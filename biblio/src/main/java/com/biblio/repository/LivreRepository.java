package com.biblio.repository;

import com.biblio.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface LivreRepository extends JpaRepository<Livre, Integer> {
    List<Livre> findByDeletedAtIsNull();
    Optional<Livre> findByIdAndDeleted_atIsNull(Integer id);
}
