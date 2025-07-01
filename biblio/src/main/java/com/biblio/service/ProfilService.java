package com.biblio.service;

import com.biblio.model.Profil;
import java.util.List;

public interface ProfilService {
    List<Profil> findAll();
    Profil findById(Integer id);
    Profil save(Profil obj);
    void deleteById(Integer id);
}
