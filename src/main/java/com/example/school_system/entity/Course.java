package com.example.school_system.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
// import com.fasterxml.jackson.annotation.JsonManagedReference;
// import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Course {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    // @OneToOne(mappedBy = "course", cascade = CascadeType.ALL)
    // @JsonBackReference
    // private Student student;

    // @ManyToOne(cascade = CascadeType.ALL)
    // @JsonBackReference
    // private Student student;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("courses")
    private List<Student> students;

}
