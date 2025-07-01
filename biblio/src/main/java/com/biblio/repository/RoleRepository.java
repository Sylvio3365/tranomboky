package com.biblio.repository;

import com.biblio.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    List<Role> findByDeleted_atIsNull();
    Optional<Role> findByIdAndDeleted_atIsNull(Integer id);
}
