package com.example.demoCrud.service;

import com.example.demoCrud.models.Response.ResponseBody;
import com.example.demoCrud.models.Response.UsersResponse;
import com.example.demoCrud.models.database.Rol;
import com.example.demoCrud.models.database.Users;
import com.example.demoCrud.models.request.UserRequest;
import com.example.demoCrud.repository.RolesRepository;
import com.example.demoCrud.repository.UsersRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UsersService {

    private UsersRepository usersRepository;
    private RolesRepository rolesRepository;

    public ResponseBody addUser(UserRequest user, String requestId){

       Rol rol = rolesRepository.findByName(user.getRol());

        Users userSave = new Users();
        userSave.setRol(rol);
        userSave.setName(user.getName());
        userSave.setEmail(user.getEmail());
        userSave.setStatus(true);
        userSave.setCreationDate(new Date());

        usersRepository.save(userSave);
        log.info("*** SE REALIZÓ EL REGISTRO DEL USUARIO ***");

        UsersResponse usersResponse = new UsersResponse();
        usersResponse.setName(user.getName());
        usersResponse.setEmail(user.getEmail());

        ResponseBody responseBody = new ResponseBody();
        responseBody.setStatus(true);
        responseBody.setRequestId(requestId);
        responseBody.setDate(new Date());
        responseBody.setData(usersResponse);

        return responseBody;
    }
}
