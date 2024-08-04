package com.example.demoCrud.models.Response;

import com.example.demoCrud.models.database.Rol;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsersResponse  {

    private String name;
    private String email;
    private Date creationDate;
    private Date editDate;
    private Rol idRol;
}
