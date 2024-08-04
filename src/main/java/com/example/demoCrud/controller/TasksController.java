package com.example.demoCrud.controller;

import com.example.demoCrud.models.Response.ResponseBody;
import com.example.demoCrud.models.request.TaskRequest;
import com.example.demoCrud.models.request.UserRequest;
import com.example.demoCrud.service.TasksService;
import com.example.demoCrud.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping(value = "/tasks")
@RestController
@Slf4j
public class TasksController {

    @Autowired
    private TasksService tasksService;

    @PostMapping("/add")
    public ResponseEntity<Object> addTask(@RequestBody TaskRequest tasks) {

        String requestId = UUID.randomUUID().toString();
        log.info("Add Tasks Service " + requestId + " " + tasks.toString());

        ResponseBody response = tasksService.addTasks(tasks, requestId);

        if (response == null) {
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

}
