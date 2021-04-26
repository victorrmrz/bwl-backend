package com.victorrmrz.prueba.security.repository;

import com.victorrmrz.prueba.security.entity.Rol;
import com.victorrmrz.prueba.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
