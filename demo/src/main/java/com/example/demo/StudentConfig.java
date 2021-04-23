package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents(){
        return new Students (
                new Student(1, "Justin Banks"),
                new Student(2, "Dave Bautista"),
                new Student(3, "Dwayne Johnson"),
                new Student(4, "John Cena"),
                new Student(5, "Shawn Michaels"),
                new Student(6, "Daniel Bryan")
        );
    }

    @Bean
    public Students previousStudents() {
        return new Students (
                new Student(99, "This one"),
                new Student(98, "That one"),
                new Student(97, "The old guy"),
                new Student(96, "The young guy"),
                new Student(95, "The middle aged guy"),
                new Student(94, "Some random people"),
                new Student (93, "That one girl"),
                new Student(92, "That other girl"),
                new Student(91, " Justine Banks")

        );
    }
}
