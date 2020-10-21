package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Task;

import java.util.List;


public interface TaskService
{
    List<Task> getTasks();

    Task getTaskById(String id);

    Task createTask(Task t);

    Task deleteTask (String id);
}
