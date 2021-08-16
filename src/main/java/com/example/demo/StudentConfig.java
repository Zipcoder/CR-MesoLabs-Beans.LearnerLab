package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    Students students;
    Students previousStudents;

    @Bean(name = "students")
    public Students currentStudents(){
        return students;
    }

    @Bean(name = "previousStudents")
    public Students previousStudents(){
        return previousStudents;
    }
}
