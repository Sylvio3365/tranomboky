package com.biblio.service;

import com.biblio.model.RegleJf;
import java.util.List;

public interface RegleJfService {
    List<RegleJf> findAll();
    RegleJf findById(Integer id);
    RegleJf save(RegleJf obj);
    void deleteById(Integer id);
}
