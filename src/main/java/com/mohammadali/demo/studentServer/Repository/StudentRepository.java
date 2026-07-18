package com.mohammadali.demo.studentServer.Repository;


import com.mohammadali.demo.studentServer.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


}
