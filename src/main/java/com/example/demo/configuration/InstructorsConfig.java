package com.example.demo.configuration;

import com.example.demo.models.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    Instructors instructors;

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors() {
        return instructors;
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors() {
        return instructors;
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors zipCodeInstructors() {
        return instructors;
    }
}
