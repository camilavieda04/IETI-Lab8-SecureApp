package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.service.TaskService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.ServletException;
import java.util.Date;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping( "api" )
public class TaskController
{

    @Autowired
    private TaskService taskService;

     @GetMapping("/tasks")
     public List <Task> getTasks(){
         return taskservice.getTasks();
     }

     @GetMapping("/tasks/{id}")
     public Task getTaskById(@PathVariable("id")String id){
         return taskService.getTaskById():
     }
   
     @PostMapping("/tasks")
     public Task createTask(@RequestBody Task task){
         return taskService.createTask(task);
     }

     @DeleteMapping("/tasks/{id}")
     public Task deleteTask(@PathVariable String id){
         return taskService.deleteTask(id);
     }

}
