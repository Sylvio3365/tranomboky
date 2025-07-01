package com.biblio.repository;

import com.biblio.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    List<Utilisateur> findByDeleted_atIsNull();
    Optional<Utilisateur> findByIdAndDeleted_atIsNull(Integer id);
}
