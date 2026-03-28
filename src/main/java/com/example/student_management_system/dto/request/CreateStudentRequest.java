package com.example.student_management_system.dto.request;

import com.example.student_management_system.entity.Student;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class CreateStudentRequest{

    private String name;
    private String email;
    private int age;
    private String major;

}