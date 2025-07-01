package com.biblio.repository;

import com.biblio.model.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface AdherentRepository extends JpaRepository<Adherent, Integer> {
    // Le nom du champ dans la classe est "deleted_at" → Spring attend "DeletedAt"
    // en camelCase
    List<Adherent> findByDeletedAtIsNull();

    Optional<Adherent> findByIdAdherentAndDeletedAtIsNull(Integer idAdherent);

}
