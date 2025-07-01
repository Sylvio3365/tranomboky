package com.biblio.service;

import com.biblio.model.Sanction;
import java.util.List;

public interface SanctionService {
    List<Sanction> findAll();
    Sanction findById(Integer id);
    Sanction save(Sanction obj);
    void deleteById(Integer id);
}
