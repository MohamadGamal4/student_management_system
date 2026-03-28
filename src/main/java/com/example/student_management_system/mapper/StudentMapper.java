package com.example.student_management_system.mapper;

import com.example.student_management_system.dto.request.CreateStudentRequest;
import com.example.student_management_system.dto.request.UpdateStudentRequest;
import com.example.student_management_system.dto.response.StudentResponse;
import com.example.student_management_system.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;


@Mapper(componentModel = "spring")
public interface StudentMapper {

    Student toEntity(CreateStudentRequest request);

    List<StudentResponse> toResponse(List<Student> students);


    StudentResponse toResponse(Student student);

    void updateEntityFromRequest(UpdateStudentRequest request, @MappingTarget Student student);


}