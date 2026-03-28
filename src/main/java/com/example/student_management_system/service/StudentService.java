package com.example.student_management_system.service;

import com.example.student_management_system.dto.request.CreateStudentRequest;
import com.example.student_management_system.dto.request.UpdateStudentRequest;
import com.example.student_management_system.dto.response.StudentResponse;

import java.util.List;

public interface StudentService {
    StudentResponse CreateStudent(CreateStudentRequest request);

    List<StudentResponse> getAllStudents();

    StudentResponse getStudentById(Long id);

    StudentResponse UpdateStudent(Long id, UpdateStudentRequest request);

    void deleteStudent(Long id);
}