package com.example.demoCrud.models.request;

import lombok.Data;

@Data
public class UserRequest {

    private String name;
    private String email;
    private String password;
    private String rol;

}
