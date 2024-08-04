package com.example.demoCrud.repository;

import com.example.demoCrud.models.database.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Tasks, Integer> {
}
