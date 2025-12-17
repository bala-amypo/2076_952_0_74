package com.example.demo.service.impl;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceImpl implements StudentService{
@Autowired
StudentRepository sr;

@Override
public Student postData(Student st){

    return sr.save(st);

}
@Override
public List<Student> getAllData(){

    return new ArrayList<>(sr.findAll());
}

@Override
public Optional<Student> getOne(Long id){
    return sr.findById(id);
}

@Override
public String delbyid(Long id){
    sr.deleteById(id);
    return "Data deleted succesfully";
}
@Override
public String delAll(){
   sr.deleteAll();
   return "All the data have been deleted";
}
@Override
public String update(Long id,Student st){
    Optional<Student>dummy=sr.findById(id);
    if(dummy.id==st.id){
        sr.delbyid(st.id);
        sr.save(st);
        return "Updated succesfully";

    }else{

        return "Enter valid data ";

    }
    
}

}