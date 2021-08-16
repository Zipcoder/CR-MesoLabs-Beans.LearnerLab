package com.example.demo.configuration;

import com.example.demo.models.Classroom;
import com.example.demo.models.Instructors;
import com.example.demo.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    Instructors instructors;
    Students students;


    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort() {
        Classroom classroom = new Classroom(instructors, students);
        return classroom;
    }

    @Bean(name = "previousCohort")
    @DependsOn({"instructors", "previous_students"})
    public Classroom previousCohort() {
        Classroom classroom = new Classroom(instructors, students);
        return classroom;
    }
}
