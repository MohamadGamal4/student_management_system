package com.example.student_management_system.mapper;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


import com.example.student_management_system.dto.request.CreateStudentRequest;
import com.example.student_management_system.dto.request.UpdateStudentRequest;
import com.example.student_management_system.dto.response.StudentResponse;
import com.example.student_management_system.entity.Student;
import org.springframework.stereotype.Component;


@Component
public class StudentMapper {

        public Student toEntity(CreateStudentRequest request) {
        Student student = new Student();
        student.setName(request.getName());
        student.setEmail(request.getEmail());
        student.setAge(request.getAge());
        student.setMajor(request.getMajor());
        student.setCreatedAt(LocalDateTime.now());
        return student;
    }

    public List<StudentResponse> toEntity(List<Student> students){



        return students.stream()
            .map(this::toResponse)
            .collect(Collectors.toList());
    }




    public StudentResponse toResponse(Student student) {
        StudentResponse response = new StudentResponse();
        response.setId(student.getId());
        response.setName(student.getName());
        response.setEmail(student.getEmail());
        response.setAge(student.getAge());
        response.setMajor(student.getMajor());
        response.setCreatedAt(student.getCreatedAt());
        return response;
    }

    public void updateEntityFromRequest(UpdateStudentRequest request, Student student) {
        student.setName(request.getName());
        student.setAge(request.getAge());
        student.setMajor(request.getMajor());
    }


}