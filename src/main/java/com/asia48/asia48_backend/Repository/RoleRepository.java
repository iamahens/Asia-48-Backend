package com.asia48.asia48_backend.Repository;

import com.asia48.asia48_backend.Model.ERole;
import com.asia48.asia48_backend.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {


    Optional<Role> findByName(ERole name);
}