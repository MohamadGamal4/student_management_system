package com.example.student_management_system.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
public class StudentResponse {

    private UUID id;
    private String name;
    private String email;
    private Integer age;
    private String major;
    private LocalDateTime CreatedAt;
    
}