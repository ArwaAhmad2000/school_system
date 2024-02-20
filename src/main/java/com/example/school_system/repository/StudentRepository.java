package com.example.school_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.school_system.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
