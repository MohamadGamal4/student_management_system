package com.example.student_management_system.dto.request;

import lombok.Data;

@Data
public class UpdateStudentRequest {

    private String name;
    private Integer age;
    private String major;

}
