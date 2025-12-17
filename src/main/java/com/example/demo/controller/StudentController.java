package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;




@RestController
public class StudentController{
    @Autowired
    StudentService dr;
    @PostMapping("/postStudent")
    public Student post(@RequestBody Student st){
        return dr.postData(st);
    }


}

