package com.biblio.service;

import com.biblio.model.Prolongement;
import java.util.List;

public interface ProlongementService {
    List<Prolongement> findAll();
    Prolongement findById(Integer id);
    Prolongement save(Prolongement obj);
    void deleteById(Integer id);
}
