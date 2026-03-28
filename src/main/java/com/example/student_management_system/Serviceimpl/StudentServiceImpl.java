package com.example.student_management_system.Serviceimpl;

import com.example.student_management_system.Repository.StudentRepo;
import com.example.student_management_system.dto.request.CreateStudentRequest;
import com.example.student_management_system.dto.response.StudentResponse;
import com.example.student_management_system.entity.Student;
import com.example.student_management_system.mapper.StudentMapper;

import com.example.student_management_system.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.student_management_system.dto.request.UpdateStudentRequest;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentmapper;
    private final StudentRepo studentrepo;


    @Override
    public StudentResponse CreateStudent(CreateStudentRequest request) {
        Student student = studentmapper.toEntity(request);

        return studentmapper.toResponse(studentrepo.save(student));
    }

    @Override
    public List<StudentResponse> getAllStudents() {
        List<Student> students = studentrepo.findAll();
        return studentmapper.toEntity(students);
    }

    @Override
    public StudentResponse getStudentById(Long id) {

        Optional<Student> student = studentrepo.findById(id);

        return studentmapper.toResponse(student.orElseThrow(() -> new RuntimeException("Student not found with id: " + id)));

    }


    @Override
    public StudentResponse UpdateStudent(Long id, UpdateStudentRequest request) {

     Student student = studentrepo.findById(id).orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        studentmapper.updateEntityFromRequest(request, student);

        Student updatedStudent = studentrepo.save(student);

        return studentmapper.toResponse(updatedStudent);

    }


    @Override
    public void deleteStudent(Long id) {

        studentrepo.deleteById(id);
    }
}








