package com.example.student_management_system.controller;

import com.example.student_management_system.dto.request.CreateStudentRequest;
import com.example.student_management_system.dto.response.StudentResponse;
import com.example.student_management_system.service.StudentService;
import com.example.studentmanagement.dto.request.UpdateStudentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

  private final  StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<StudentResponse> createStudent(@RequestBody CreateStudentRequest request) {
        StudentResponse studentResponse;

        studentResponse = studentService.CreateStudent(request);


        return ResponseEntity.ok(studentResponse);

    }

    @GetMapping
    public ResponseEntity<List<StudentResponse>> getAllStudents() {
        List<StudentResponse> studentResponses = studentService.getAllStudents();

        return ResponseEntity.ok(studentResponses);
    }


    @GetMapping("/{id}")
    public ResponseEntity<StudentResponse> getStudentById(@PathVariable Long id) {

        StudentResponse studentResponse = studentService.getStudentById(id);

        return ResponseEntity.ok(studentResponse);
    }


    @PutMapping("/{id}")
    public ResponseEntity<StudentResponse> UpdateStudent(@RequestBody UpdateStudentRequest request, @PathVariable Long id) {
        StudentResponse studentResponse = studentService.UpdateStudent(id, request);

        return ResponseEntity.ok(studentResponse);
    }


    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {

        studentService.deleteStudent(id);

    }


}