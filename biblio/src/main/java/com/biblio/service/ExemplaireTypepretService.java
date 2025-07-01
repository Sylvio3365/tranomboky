package com.biblio.service;

import com.biblio.model.ExemplaireTypepretId;
import com.biblio.model.ExemplaireTypepret;
import java.util.List;

public interface ExemplaireTypepretService {
    List<ExemplaireTypepret> findAll();
    ExemplaireTypepret findById(ExemplaireTypepretId id);
    ExemplaireTypepret save(ExemplaireTypepret obj);
    void deleteById(ExemplaireTypepretId id);
}
