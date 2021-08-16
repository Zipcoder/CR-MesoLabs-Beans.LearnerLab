package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    Students students;

    @Bean(name = "students")
    public Students currentStudents() {
        return students;
    }

    @Bean(name = "previous_students")
    public Students previousStudents() {
        return students;
    }
}
