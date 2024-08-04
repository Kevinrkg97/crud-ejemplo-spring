package com.example.demoCrud.repository;

import com.example.demoCrud.models.database.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface RolesRepository extends JpaRepository<Rol, Integer> {

    Rol findByName(@Param("name") String name);
}
