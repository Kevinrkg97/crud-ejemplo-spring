package com.example.demoCrud.models.database;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
public class TaskStudent {

    @Column(name = "id_task")
    private int idTask;
    @Column(name = "id_student")
    private int idStudent;
    @Column(name = "assigment_status")
    private Boolean assigmentStatus;
    @Column(name = "assigment_date")
    private Date assigmentDate;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name = "edit_date")
    private Date editDate;
}
