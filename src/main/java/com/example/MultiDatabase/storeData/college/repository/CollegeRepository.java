package com.example.MultiDatabase.storeData.college.repository;


import com.example.MultiDatabase.storeData.college.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository  extends JpaRepository<College, Integer> {

}