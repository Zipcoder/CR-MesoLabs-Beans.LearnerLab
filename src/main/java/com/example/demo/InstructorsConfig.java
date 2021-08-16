package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {
    Instructors usaInstructors;
    Instructors ukInstructors;
    Instructors zcwInstructors;

    @Bean(name = "tcUsaInstructors")
    public Instructors getTcUsaInstructors(){
        return usaInstructors;
    }

    @Bean(name = "tcUkInstructors")
    public Instructors getTcUkInstructors(){
        return ukInstructors;
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors getZcwInstructors(){
        return zcwInstructors;
    }
}
