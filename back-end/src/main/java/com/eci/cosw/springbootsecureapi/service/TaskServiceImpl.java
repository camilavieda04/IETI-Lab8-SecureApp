package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@Service
public class TaskServiceImpl
    implements TaskService
{
    
    private List<Task> tasks = new ArrayList<>();


    @Autowired
    public TaskServiceImpl()
    {
    }

    @PostConstruct
    private void populateSampleData()
    {
        tasks.add(new Task("01","In progress",new Date(),"Implement Login view"));
    }


    @Override
    public List<Task> getTasks()
    {
        return tasks;
    }

    @Override
    public Task getTaskById(String id)
    {
        Task t = null;
        for (Task task: tasks){
            if(task.getId().equals(id)){
                t=task;
            }
        }
        return t;
    }

    @Override
    public Task createTask( Task task )
    {
        return tasks.get( 0 );
    }

    @Override
    public Task deleteTask( String id )
    {
        return null;
    }
}
