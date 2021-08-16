package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    Students students;
    Students previousStudents;

    @Bean(name = "students")
    public Students currentStudents(){
        return new Students(
                new Student(1l, "Zach"),
                new Student(2l, "Manny"),
                new Student(3l, "Dee")
        );
    }

    @Bean(name = "previousStudents")
    public Students previousStudents(){
        return new Students(
                new Student(4l, "Pank"),
                new Student(5l, "Shank"),
                new Student(6l, "Stank")
        );
    }
}
