package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;


@RestController
public class StudentController{
    @Autowired
    StudentService dr;
    @PostMapping("/postStudent")
    public Student post(@RequestBody Student st){
        return dr.postData(st);
    }
    @GetMapping("/getStudent")
    public List<Student> get(){
        return dr.getAllData();
    }
    @GetMapping("/getOne/{id}")
    public Optional<Student> get(Long id){
        return dr.getOne(id);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(Long id){
        return dr.delbyid(id);
    }
    @DeleteMapping("/deleteall")
    public String dAll(){
         return dr.delAll();
    }


}

