package com.biblio.service;

import com.biblio.model.StatutGlobal;
import java.util.List;

public interface StatutGlobalService {
    List<StatutGlobal> findAll();
    StatutGlobal findById(Integer id);
    StatutGlobal save(StatutGlobal obj);
    void deleteById(Integer id);
}
