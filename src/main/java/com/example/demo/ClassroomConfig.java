package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    Classroom currentCohort;
    Classroom previousCohort;

    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(){
        return currentCohort;
    }

    @Bean(name = "previousCohort")
    @DependsOn({"instructors", "students"})
    public Classroom previousCohort(){
        return previousCohort;
    }
}
