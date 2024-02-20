package com.example.school_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.school_system.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
