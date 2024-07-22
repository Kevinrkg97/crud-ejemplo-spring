package com.example.demoCrud.repository;

import com.example.demoCrud.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UsuariosRepository extends JpaRepository<Users, Long> {

    List<Users> findAll();
}
