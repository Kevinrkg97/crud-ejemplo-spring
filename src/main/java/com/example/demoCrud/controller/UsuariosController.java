package com.example.demoCrud.controller;


import com.example.demoCrud.models.Users;
import com.example.demoCrud.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/users")
@RestController
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @PostMapping("/add")
    public String add(@RequestBody Users user) {

        String response = usuariosService.addUser(user);

        return response;
    }

    @GetMapping("/getUsers")
    public List<Users> getUsers() {

        List<Users> response = usuariosService.getUsers();

        return response;
    }

    @DeleteMapping ("/deleteUser/{id}")
    public String delete (@PathVariable Long id) {
        String deleteUser = usuariosService.deleteUser(id);
        return deleteUser;
    }
    @PutMapping ("/updateUser/{id}")
    public String update (@PathVariable int id, @RequestBody Users user) {
        user.setId(id);
        String updateUser = usuariosService.updateUser(user);
        return updateUser;
    }
}
