package com.biblio.service;

import com.biblio.model.ProfilRegleId;
import com.biblio.model.ProfilRegle;
import java.util.List;

public interface ProfilRegleService {
    List<ProfilRegle> findAll();
    ProfilRegle findById(ProfilRegleId id);
    ProfilRegle save(ProfilRegle obj);
    void deleteById(ProfilRegleId id);
}
