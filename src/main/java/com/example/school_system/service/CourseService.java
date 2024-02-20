package com.example.school_system.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.school_system.entity.Course;
import com.example.school_system.repository.CourseRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

}
