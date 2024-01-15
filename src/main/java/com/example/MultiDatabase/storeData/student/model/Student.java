
package com.example.MultiDatabase.storeData.student.model;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employeeId")
    private int id;
    @Column(name = "studentName")
    private String name;
    @Column(name = "studentAge")
    private String age;
}