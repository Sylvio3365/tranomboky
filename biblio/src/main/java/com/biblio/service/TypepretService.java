package com.biblio.service;

import com.biblio.model.Typepret;
import java.util.List;

public interface TypepretService {
    List<Typepret> findAll();
    Typepret findById(Integer id);
    Typepret save(Typepret obj);
    void deleteById(Integer id);
}
