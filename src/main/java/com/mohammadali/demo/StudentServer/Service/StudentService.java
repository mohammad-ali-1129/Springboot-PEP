//package com.mohammadali.demo.StudentServer.Service;
//import com.mohammadali.demo.StudentServer.Repository.StudentRepository;
//import com.mohammadali.demo.StudentServer.Entity.Student;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//
//@Service
//public class StudentService {
//
//    StudentRepository studentRepository;
//
//    public StudentService(StudentRepository studentRepository){
//        this.studentRepository = studentRepository;
//    }
//
//    public Student studentValidate(Student student){
//        int id = student.getId();
//        String name = student.getName();
//        int age = student.getAge();
//        String dept = student.getDept();
//
//        if(id<0 || name==null || age<0 || dept==null || name.isBlank() || dept.isBlank()) {
//            return null;
//        }
//
//
//
//        student.setCreatedAt(LocalDateTime.now());
//        student.setUpdatedAt(LocalDateTime.now());
//
//        studentRepository.save(student);
//        return student;
//    }
//
//    public Student getStudentById(int id){
//        return studentRepository.findById(id).orElse(null);
//    }
//
//    public Student updateStudentById(int id, Student student){
//        Student existing = studentRepository.findById(id).orElse(null);
//
//        if(existing == null){
//            return null;
//        }
//
//        existing.setName(student.getName());
//        existing.setAge(student.getAge());
//        existing.setDept(student.getDept());
//        existing.setUpdatedAt(LocalDateTime.now());
//        return studentRepository.save(existing);
//    }
//
//    public boolean deleteStudentById(int id){
//        Student existing = studentRepository.findById(id).orElse(null);
//
//        if(existing == null){
//            return false;
//        }
//
//        studentRepository.delete(existing);
//        return true;
//    }
//}
























package com.mohammadali.demo.StudentServer.Service;

import com.mohammadali.demo.StudentServer.DTO.CreateStudentRequestDTO;
import com.mohammadali.demo.StudentServer.DTO.CreateStudentResponseDTO;
import com.mohammadali.demo.StudentServer.Entity.Student;
import com.mohammadali.demo.StudentServer.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public CreateStudentResponseDTO studentValidate(CreateStudentRequestDTO createStudentRequestDTO) {

        Student student = mapToStudent(createStudentRequestDTO);
        studentRepository.save(student);
        return mapToResponseDTO(student);
    }

    public Student getStudentById(int id) throws Exception {
        return studentRepository.findById(id)
                .orElseThrow(() -> new Exception("Student not found"));
    }

    public Student studentUpdate(int id, Student student) {

        Student result = studentRepository.findById(id).orElse(null);

        if (result == null) {
            return null;
        }

        result.setName(student.getName());
        result.setAge(student.getAge());

        // Department should NOT be amended.
        // Therefore, we do not update the department field.

        result.setUpdatedAt(LocalDateTime.now());

        return studentRepository.save(result);
    }

    public Student deleteStudent(int id) {

        Student result = studentRepository.findById(id).orElse(null);

        if (result == null) {
            return null;
        }

        studentRepository.delete(result);
        return result;
    }

    private Student mapToStudent(CreateStudentRequestDTO createStudentRequestDTO) {

        Student student = new Student();

        student.setName(createStudentRequestDTO.getName());
        student.setAge(createStudentRequestDTO.getAge());
        student.setDepartment(createStudentRequestDTO.getDepartment());
        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());

        return student;
    }

    private CreateStudentResponseDTO mapToResponseDTO(Student student) {

        CreateStudentResponseDTO createStudentResponseDTO = new CreateStudentResponseDTO();

        createStudentResponseDTO.setId(student.getId());
        createStudentResponseDTO.setName(student.getName());
        createStudentResponseDTO.setAge(student.getAge());
        createStudentResponseDTO.setDepartment(student.getDepartment());

        return createStudentResponseDTO;
    }
}