package com.biblio.repository;

import com.biblio.model.Profil;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface ProfilRepository extends JpaRepository<Profil, Integer> {
    List<Profil> findByDeleted_atIsNull();
    Optional<Profil> findByIdAndDeleted_atIsNull(Integer id);
}
