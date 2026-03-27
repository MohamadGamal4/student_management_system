package com.example.student_management_system.dto.request;

import com.example.student_management_system.entity.Student;

public class CreateStudentRequest{

    private String name;
    private String email;
    private int age;
    private String major;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    
}