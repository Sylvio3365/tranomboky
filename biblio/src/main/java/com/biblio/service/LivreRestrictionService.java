package com.biblio.service;

import com.biblio.model.LivreRestrictionId;
import com.biblio.model.LivreRestriction;
import java.util.List;

public interface LivreRestrictionService {
    List<LivreRestriction> findAll();
    LivreRestriction findById(LivreRestrictionId id);
    LivreRestriction save(LivreRestriction obj);
    void deleteById(LivreRestrictionId id);
}
