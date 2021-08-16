package com.example.demo.configuration;

import com.example.demo.models.Instructor;
import com.example.demo.models.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors() {
        return new Instructors(
                new Instructor(1L, "Stewart"),
                new Instructor(2L, "Colin"),
                new Instructor(3L, "Tom")
        );
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors() {
        return new Instructors(
                new Instructor(1L, "Harry"),
                new Instructor(2L, "Ron"),
                new Instructor(3L, "Hermione")
        );
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors zipCodeInstructors() {
        return new Instructors(
                new Instructor(1L, "Leon"),
                new Instructor(2L, "Dolio"),
                new Instructor(3L, "Kris")
        );
    }
}
