package com.biblio.service;

import com.biblio.model.Restriction;
import java.util.List;

public interface RestrictionService {
    List<Restriction> findAll();
    Restriction findById(Integer id);
    Restriction save(Restriction obj);
    void deleteById(Integer id);
}
