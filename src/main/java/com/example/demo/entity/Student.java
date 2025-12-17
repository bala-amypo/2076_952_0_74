package com.example.demo.entity;
import java.time.*;
public class Student{
    private Long id;
    private String name;
    private String dept;
    private LocalDate dob;
    private float cgpa;
    public Student(){

    }
     public Student(Long id,String name,String dept,LocalDate dob,float cgpa){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.dob=dob;
        this.cgpa=cgpa;
    }
    void setId(Long id){
         this.id=id;
    }
    void setName(String name){
         this.name=name;
    }

    void setDept(String dept){
         this.dept=dept;
    }
     void setDob(LocalDate dob){
        
    }
     void setCgpa(float cgpa){
        
    }




}