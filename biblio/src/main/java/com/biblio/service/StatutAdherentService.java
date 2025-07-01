package com.biblio.service;

import com.biblio.model.StatutAdherent;
import java.util.List;

public interface StatutAdherentService {
    List<StatutAdherent> findAll();
    StatutAdherent findById(Integer id);
    StatutAdherent save(StatutAdherent obj);
    void deleteById(Integer id);
}
