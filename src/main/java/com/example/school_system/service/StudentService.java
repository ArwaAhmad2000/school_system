package com.example.school_system.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.school_system.entity.Student;
import com.example.school_system.repository.StudentRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}
