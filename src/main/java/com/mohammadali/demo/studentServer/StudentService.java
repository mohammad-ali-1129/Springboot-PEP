package com.mohammadali.demo.studentServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student studentValidate(Student student) {

        long id = student.getId();
        String name = student.getName();
        int age = student.getAge();
        String dept = student.getDept();

        if(id < 0 || name == null || age < 0 || dept == null) {
            return null;
        }

        studentRepository.save(student);
        return student;

    }
}