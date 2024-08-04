package com.example.demoCrud.service;

import com.example.demoCrud.models.Response.ResponseBody;
import com.example.demoCrud.models.database.SchoolGroup;
import com.example.demoCrud.models.database.Tasks;
import com.example.demoCrud.models.database.Users;
import com.example.demoCrud.models.request.TaskRequest;
import com.example.demoCrud.repository.SchoolGroupRepository;
import com.example.demoCrud.repository.TaskRepository;
import com.example.demoCrud.repository.UsersRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TasksService {

    private UsersRepository usersRepository;
    private SchoolGroupRepository schoolGroupRepository;
    private TaskRepository taskRepository;

    public ResponseBody addTasks(TaskRequest taskRequest, String requestId){

        Optional<Users> user = usersRepository.findById(1);

        Tasks tasks = new Tasks();
        tasks.setTitle (taskRequest.getTitle());
        tasks.setDescription (taskRequest.getDescription());

        if(!user.isEmpty())
            tasks.setIdTeacher(user.get());

        SchoolGroup schoolGroup = schoolGroupRepository.findByName(taskRequest.getSchoolGroup());
         if (schoolGroup != null)
             tasks.setSchoolGroup (schoolGroup);
         tasks.setCreationDate (new Date());
         tasks.setStatus (true);

         taskRepository.save(tasks);
         log.info("*** SE REALIZÓ EL REGISTRO DE LA TAREA ***");

        ResponseBody responseBody = new ResponseBody();
        responseBody.setStatus(true);
        responseBody.setRequestId(requestId);
        responseBody.setDate(new Date());
        responseBody.setData("Se asignó la tarea al grupo " + schoolGroup.getName() + ".");

        return responseBody;
    }

    public String updateTask(){
        return null;
    }
}
