package com.biblio.repository;

import com.biblio.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    List<Role> findByDatedeleteIsNull();
    Optional<Role> findById_roleAndDatedeleteIsNull(Integer id_role);
}
