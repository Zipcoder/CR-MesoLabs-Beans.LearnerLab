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
        return new Instructors(
                new Instructor(100l, "Leon Hunter"),
                new Instructor(101l, "Leon HunterX"),
                new Instructor(102l, "Leon Hunter-Moon")
        );
    }

    @Bean(name = "tcUkInstructors")
    public Instructors getTcUkInstructors(){
        return new Instructors(
                new Instructor(103l, "Sir Leon Hunter"),
                new Instructor(104l, "Sir Leon HunterX"),
                new Instructor(105l, "Sir Leon Hunter-Moon")
        );
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors getZcwInstructors(){
        return new Instructors(
                new Instructor(106l, "Big Leon"),
                new Instructor(107l, "Small Leon"),
                new Instructor(108l, "RegularSize Leon")
        );
    }
}
