package com.example.MultiDatabase.controller;

import com.example.MultiDatabase.storeData.college.model.College;


import com.example.MultiDatabase.storeData.college.repository.CollegeRepository;
import com.example.MultiDatabase.storeData.student.model.Student;

import com.example.MultiDatabase.storeData.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CollegeRepository collegeRepository;

    @RequestMapping(value="/student", method= RequestMethod.GET)
    public List<Student> getPrimaryDatabaseData() {
        List<Student> list = studentRepository.findAll();
        return list;
    }

    @RequestMapping(value="/college", method=RequestMethod.GET)
    public List<College> getSecondaryDatabaseData() {
        List<College> list = collegeRepository.findAll();
        return list;
    }
    @PostMapping("/student")
    public Student addEmployee(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @PostMapping("/college")
    public College addManager(@RequestBody College college){
        return collegeRepository.save(college);
    }
}

