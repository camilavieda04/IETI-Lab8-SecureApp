package com.eci.cosw.springbootsecureapi.model;

public class Task
{

    private String id;

    private String status;

    private User responsible;

    private Date dueDate;

    private String description;


    public Task()
    {
    }

    public Task(String id, String status, Date dueDate, String description){
      this.id=id;
      this.status=status;
      this.dueDate=dueDate;
      this.description=description;  
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id=id;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status=status;
    }

    public User getResponsible(){
        return responsible;
    }

    public void setResponsible(User responsible){
        this.responsible=responsible;
    }

    public Date getDueDate(){
        return dueDate;
    }

    public void setDueDate(Date dueDate){
        this.dueDate=dueDate;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }