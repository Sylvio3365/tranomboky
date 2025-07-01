package com.biblio.repository;

import com.biblio.model.LivreRestriction;
import com.biblio.model.LivreRestrictionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRestrictionRepository extends JpaRepository<LivreRestriction, LivreRestrictionId> {
}
