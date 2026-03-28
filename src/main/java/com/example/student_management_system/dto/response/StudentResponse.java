package com.example.student_management_system.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class StudentResponse {

    private Long id;
    private String name;
    private String email;
    private Integer age;
    private String major;
    private LocalDateTime CreatedAt;
    
}