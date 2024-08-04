package com.example.demoCrud.repository;

import com.example.demoCrud.models.database.Rol;
import com.example.demoCrud.models.database.SchoolGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface SchoolGroupRepository extends JpaRepository<SchoolGroup, Integer> {

    SchoolGroup findByName(@Param("name") String name);
}
