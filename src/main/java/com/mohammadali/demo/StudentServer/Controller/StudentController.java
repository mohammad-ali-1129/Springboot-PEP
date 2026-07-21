//package com.mohammadali.demo.StudentServer.Controller;
//
//import com.mohammadali.demo.StudentServer.Entity.Student;
//import com.mohammadali.demo.StudentServer.Service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;

//@RestController
//@CrossOrigin(origins = "http://localhost:5173")
//
//public class StudentController {
//
//    StudentService studentService;
//
//    @Autowired
//    public StudentController(StudentService studentService){
//        this.studentService = studentService;
//    }
//
//    @PostMapping("/create")
//    public ResponseEntity<Student> storeStudent(@RequestBody Student student){
//        Student result = studentService.studentValidate(student);
//        if(result==null){
//            return ResponseEntity.status(400).body(result);
//        }
//        return ResponseEntity.status(201).body(result);
//    }
//
//    @GetMapping("/get/{id}")
//    public ResponseEntity<?> getStudentById(@PathVariable int id){
//        Student student = studentService.getStudentById(id);
//        return ResponseEntity.status(200).body(student);
//    }
//
//    @PutMapping("/update/{id}")
//    public ResponseEntity<?> updateStudentById(@PathVariable int id, @RequestBody Student student){
//        Student updatedStudent = studentService.updateStudentById(id, student);
//
//        if(updatedStudent == null){
//            return ResponseEntity.status(404).body("student not found");
//        }
//
//        return ResponseEntity.status(200).body(updatedStudent);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> deleteStudentById(@PathVariable int id){
//        boolean deleted = studentService.deleteStudentById(id);
//
//        if(!deleted){
//            return ResponseEntity.status(404).body("Student not found");
//        }
//
//        return ResponseEntity.status(200).body("Student deleted successfully");
//    }
//
//}






















//package com.ismail.demo.StudentServer.Controller;
//
//import com.ismail.demo.StudentServer.DTO.ChangePasswordDTO;
//import com.ismail.demo.StudentServer.DTO.RequestStudentDTO;
//import com.ismail.demo.StudentServer.DTO.ResponseStudentDTO;
//import com.ismail.demo.StudentServer.Entity.Student;
//import com.ismail.demo.StudentServer.Service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@CrossOrigin(origins = "http://localhost:5173")
//
//public class StudentController {
//
//    StudentService studentService;
//
//    @Autowired
//    public StudentController(StudentService studentService){
//        this.studentService = studentService;
//    }
//
//    @PostMapping("/create")
//    public ResponseEntity<ResponseStudentDTO> storeStudent(@RequestBody Student student){
//        ResponseStudentDTO result = studentService.studentValidate(student);
//        if(result==null){
//            return ResponseEntity.status(400).body(result);
//        }
//        return ResponseEntity.status(201).body(result);
//    }
//
//    @GetMapping("/get/{id}")
//    public ResponseEntity<?> getStudentById(@PathVariable int id){
//        ResponseStudentDTO student = studentService.getStudentById(id);
//        if(student==null){
//            return ResponseEntity.status(404).body("Student not found");
//        }
//        return ResponseEntity.status(200).body(student);
//    }
//
//    @PutMapping("/update/{id}")
//    public ResponseEntity<?> updateStudentById(@PathVariable int id, @RequestBody RequestStudentDTO dto){
//        ResponseStudentDTO updatedStudent = studentService.updateStudent(id, dto);
//
//        if(updatedStudent == null){
//            return ResponseEntity.status(404).body("student not found");
//        }
//
//        return ResponseEntity.status(200).body(updatedStudent);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> deleteStudentById(@PathVariable int id){
//        boolean deleted = studentService.deleteStudentById(id);
//
//        if(!deleted){
//            return ResponseEntity.status(404).body("Student not found");
//        }
//
//        return ResponseEntity.status(200).body("Student deleted successfully");
//    }
//
//    @PutMapping("/change-password/{id}")
//    public ResponseEntity<?> changePassword(@PathVariable int id, @RequestBody ChangePasswordDTO dto) {
//        boolean passwordChanged = studentService.changePassword(id, dto);
//        if(!passwordChanged){
//            return ResponseEntity.status(404).body("student not found or incorrect password");
//        }
//        return ResponseEntity.status(200).body("Password changed successfully");
//    }
//
//}





//
//
//
//package com.mohammadali.demo.StudentServer.Controller;
//
//import com.mohammadali.demo.StudentServer.DTO.CreateStudentRequestDTO;
//import com.mohammadali.demo.StudentServer.DTO.CreateStudentResponseDTO;
//import com.mohammadali.demo.StudentServer.Entity.Student;
//import com.mohammadali.demo.StudentServer.Service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//
//
//
//import org.springframework.web.bind.annotation.CrossOrigin;
//
//@CrossOrigin(origins = "http://localhost:5173")
//@RestController
//public class StudentController {
//
//    StudentService studentService;
//
//    @Autowired
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }
//
//    @PostMapping("/create")
//    public ResponseEntity<?> storeStudent(@RequestBody CreateStudentRequestDTO createStudentRequestDTO) {
//        CreateStudentResponseDTO result = studentService.studentValidate(createStudentRequestDTO);
//
//        if(result == null)
//        {
//            return ResponseEntity.status(400).body("Invalid input");
//        }
//        return  ResponseEntity.status(201).body(result);
//    }
//
//    @GetMapping("/getStudent/{id}")
//    public ResponseEntity<?> getStudentById(@PathVariable int id) throws Exception {
//
//        Student student = studentService.getStudentById(id);
//
//        if(student == null){
//            return ResponseEntity.status(404).body("Student not found");
//        }
//
//        return ResponseEntity.ok(student);
//    }
//
//    @PutMapping("/updateStudent/{id}")
//    public ResponseEntity<?> updateStudent(@PathVariable int id, @RequestBody Student student){
//        Student result = studentService.studentUpdate(id, student);
//        if(result == null)
//        {
//            return ResponseEntity.status(400).body("Invalid input");
//        }
//        return ResponseEntity.status(200).body(result);
//    }
//
//    @DeleteMapping("/deleteStudent/{id}")
//    public ResponseEntity<?> deleteStudent(@PathVariable int id){
//        Student student = studentService.deleteStudent(id);
//        if(student == null) {
//            return ResponseEntity.status(400).body("Invalid input");
//        }
//        return ResponseEntity.status(200).body("Student deleted");
//    }
//}









package com.mohammadali.demo.StudentServer.Controller;

import com.mohammadali.demo.StudentServer.DTO.CreateStudentRequestDTO;
import com.mohammadali.demo.StudentServer.DTO.CreateStudentResponseDTO;
import com.mohammadali.demo.StudentServer.Entity.Student;
import com.mohammadali.demo.StudentServer.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Create Student
    @PostMapping("/create")
    public ResponseEntity<?> storeStudent(@RequestBody CreateStudentRequestDTO createStudentRequestDTO) {

        CreateStudentResponseDTO result = studentService.studentValidate(createStudentRequestDTO);

        if (result == null) {
            return ResponseEntity.badRequest().body("Invalid input");
        }

        return ResponseEntity.status(201).body(result);
    }

    // Get Student
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id) throws Exception {

        Student student = studentService.getStudentById(id);

        return ResponseEntity.ok(student);
    }

    // Update Student
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable int id,
                                           @RequestBody Student student) {

        Student result = studentService.studentUpdate(id, student);

        if (result == null) {
            return ResponseEntity.status(404).body("Student not found");
        }

        return ResponseEntity.ok(result);
    }

    // Delete Student
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable int id) {

        Student student = studentService.deleteStudent(id);

        if (student == null) {
            return ResponseEntity.status(404).body("Student not found");
        }

        return ResponseEntity.ok("Student deleted successfully");
    }

}