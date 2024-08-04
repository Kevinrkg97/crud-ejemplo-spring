package com.example.demoCrud.repository;

import com.example.demoCrud.models.database.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
