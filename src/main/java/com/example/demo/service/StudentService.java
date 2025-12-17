package com.example.demo.service;
import com.example.demo.entity.Student;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
public interface StudentService{
   public Student postData(Student st);
   public List<Student> getAllData();
   public Optional<Student> getOne(Long id);
}
