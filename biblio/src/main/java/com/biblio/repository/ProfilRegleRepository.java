package com.biblio.repository;

import com.biblio.model.ProfilRegle;
import com.biblio.model.ProfilRegleId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfilRegleRepository extends JpaRepository<ProfilRegle, ProfilRegleId> {
}
