package com.biblio.repository;

import com.biblio.model.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface AdherentRepository extends JpaRepository<Adherent, Integer> {
    // Le nom du champ dans la classe est "datedelete" → Spring attend "Datedelete"
    // en camelCase
    List<Adherent> findByDatedeleteIsNull();

    Optional<Adherent> findByIdAdherentAndDatedeleteIsNull(Integer idAdherent);

}
