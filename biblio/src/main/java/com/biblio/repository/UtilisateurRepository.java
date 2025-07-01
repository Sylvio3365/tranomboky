package com.biblio.repository;

import com.biblio.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    List<Utilisateur> findByDeletedAtIsNull();
    Optional<Utilisateur> findByIdUtilisateurAndDeletedAtIsNull(Integer idUtilisateur);
}
