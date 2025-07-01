package com.biblio.service;

import com.biblio.model.Regle;
import java.util.List;

public interface RegleService {
    List<Regle> findAll();
    Regle findById(Integer id);
    Regle save(Regle obj);
    void deleteById(Integer id);
}
