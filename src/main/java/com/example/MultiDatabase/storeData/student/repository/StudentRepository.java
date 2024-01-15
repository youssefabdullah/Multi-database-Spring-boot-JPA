package com.example.MultiDatabase.storeData.student.repository;

import com.example.MultiDatabase.storeData.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student, Integer> {

}