package com.example.demoCrud.models.database;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
//@NoArgsConstructor(force = true)
//@RequiredArgsConstructor
@Table(name = "school_group", schema = "public")
public class SchoolGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_school_group")
    private int idSchoolGroup;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name = "edit_date")
    private Date editDate;
}
