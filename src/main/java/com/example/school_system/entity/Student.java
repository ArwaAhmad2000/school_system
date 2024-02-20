package com.example.school_system.entity;

import java.util.List;
// import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
// import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    // @OneToOne(cascade = CascadeType.ALL)
    // @JsonManagedReference
    // private Course course;

    // @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    // @JsonManagedReference
    // private List<Course> courses;

    @ManyToMany(mappedBy = "students", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("students")
    private List<Course> courses;

}
