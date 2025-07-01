package com.biblio.repository;

import com.biblio.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    List<Utilisateur> findByDatedeleteIsNull();
    Optional<Utilisateur> findByIdUtilisateurAndDatedeleteIsNull(Integer idUtilisateur);
}
