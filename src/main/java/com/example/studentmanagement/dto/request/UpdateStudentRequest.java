package com.example.studentmanagement.dto.request;


public class UpdateStudentRequest {

    private String name;
    private Integer age;
    private String major;
    

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
}
