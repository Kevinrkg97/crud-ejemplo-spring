package com.example.demoCrud.controller;


import com.example.demoCrud.models.Response.ResponseBody;
import com.example.demoCrud.models.Response.UsersResponse;
import com.example.demoCrud.models.database.Users;
import com.example.demoCrud.models.request.UserRequest;
import com.example.demoCrud.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping(value = "/users")
@RestController
@Slf4j
public class UsuariosController {

    @Autowired
    private UsersService usersService;

@PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody UserRequest user) {

        String requestId = UUID.randomUUID().toString();
        log.info("Add Users Service " + requestId + " " + user.toString());

        ResponseBody response = usersService.addUser(user, requestId);

        if(response == null){
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/getUsers")
    public List<Users> getUsers() {


        return null;
    }

    @DeleteMapping ("/deleteUser/{id}")
    public String delete (@PathVariable Long id) {
        return null;
    }
    @PutMapping ("/updateUser/{id}")
    public String update (@PathVariable int id, @RequestBody Users user) {

        return null;
    }
}
