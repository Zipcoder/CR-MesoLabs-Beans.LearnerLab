package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    Classroom currentCohort;
    Classroom previousCohort;

    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructor, Students students){
        return new Classroom(instructor, students);
    }

    @Bean(name = "previousCohort")
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(Instructors instructors,@Qualifier("previousStudents") Students students){
        return new Classroom(instructors, students);
    }
}
