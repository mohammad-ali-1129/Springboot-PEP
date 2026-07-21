//package com.mohammadali.demo.StudentServer.Repository;
//
//
//import com.mohammadali.demo.StudentServer.Entity.Student;
//import org.springframework.data.jpa.repository.JpaRepository;
//
////@Repository
//public interface StudentRepository extends JpaRepository<Student,Integer> {
//
//
//}






package com.mohammadali.demo.StudentServer.Repository;

import com.mohammadali.demo.StudentServer.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {

}