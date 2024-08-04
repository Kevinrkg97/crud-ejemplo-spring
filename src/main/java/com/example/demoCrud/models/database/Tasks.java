package com.example.demoCrud.models.database;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity

@Table(name = "tasks", schema = "public")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_task")
    private int idTask;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name = "id_teacher", foreignKey = @ForeignKey(name = "tasks_id_teacher_fkey"))
    //@Column(name = "id_teacher")
    private Users idTeacher;
    @ManyToOne(targetEntity = SchoolGroup.class)
    @JoinColumn(name = "id_school_group", foreignKey = @ForeignKey(name = "tasks_id_school_group_fkey"))
    //@Column(name = "id_school_group")
    private SchoolGroup schoolGroup;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name = "edit_date")
    private Date editDate;
    @Column(name = "status")
    private Boolean status;


}
