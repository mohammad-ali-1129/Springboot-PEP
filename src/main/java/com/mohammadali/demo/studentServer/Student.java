package com.mohammadali.demo.studentServer;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    long Id;
    String name;
    int age;
    String dept;



}
