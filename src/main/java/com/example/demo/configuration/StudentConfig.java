package com.example.demo.configuration;

import com.example.demo.models.Student;
import com.example.demo.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {


    @Bean(name = "students")
    public Students currentStudents() {
        return new Students(
                new Student(1L, "Jen"),
                new Student(2L, "Jeremy"),
                new Student(3L, "Char")
        );
    }

    @Bean(name = "previous_students")
    public Students previousStudents() {
        return new Students(
                new Student(1L, "Chris"),
                new Student(2L, "Earl"),
                new Student(3L, "Jack")
        );
    }
}
