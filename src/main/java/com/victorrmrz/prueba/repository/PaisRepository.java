package com.victorrmrz.prueba.repository;

import com.victorrmrz.prueba.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {

    Optional<Pais> findByNombre(String nombre);
    boolean existsByNombre(String nombre);


}
