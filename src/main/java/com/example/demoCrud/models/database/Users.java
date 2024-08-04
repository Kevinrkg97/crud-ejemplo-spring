package com.example.demoCrud.models.database;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
//@NoArgsConstructor(force = true)
//@RequiredArgsConstructor
@Table(name = "users", schema = "public")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int idUser;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @ManyToOne(targetEntity = Rol.class)
    @JoinColumn(name = "id_rol", foreignKey = @ForeignKey(name = "users_id_rol_fkey"))
    private Rol rol;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name = "edit_date")
    private Date editDate;

}
