package com.biblio.service;

import com.biblio.model.Role;
import java.util.List;

public interface RoleService {
    List<Role> findAll();
    Role findById(Integer id);
    Role save(Role obj);
    void deleteById(Integer id);
}
