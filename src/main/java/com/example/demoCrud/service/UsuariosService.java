package com.example.demoCrud.service;

import com.example.demoCrud.models.Users;
import com.example.demoCrud.repository.UsuariosRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@AllArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class UsuariosService {

    private UsuariosRepository usuariosRepository;


    public String addUser(Users user) {

        usuariosRepository.save(user);

        return "Se registró el usuario";
    }

    public List<Users> getUsers(){
        List<Users> users = usuariosRepository.findAll();
        return users;

    }

    public String deleteUser (Long id){
        usuariosRepository.deleteById(id);

        return "Se elimino el usuario";
    }

    public String updateUser (Users user){
        usuariosRepository.save(user);

        return "Se actualizo el usuario";
    }
}
