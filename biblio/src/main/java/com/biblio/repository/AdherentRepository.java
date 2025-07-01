package com.biblio.repository;

import com.biblio.model.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface AdherentRepository extends JpaRepository<Adherent, Integer> {
    // Le nom du champ dans la classe est "deleted_at" → Spring attend "DeletedAt"
    // en camelCase
    // Il faut garder les underscores dans le nom de la méthode !
    List<Adherent> findByDeleted_atIsNull();

    Optional<Adherent> findById_adherentAndDeleted_atIsNull(Integer id_adherent);

}
