package com.example.demo;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors t, @Qualifier("students")Students s) {
        return new Classroom(t,s);
    }

    @Bean
    public Classroom previousCohort(Instructors t, @Qualifier("previousStudents")Students s) {
        return new Classroom(t,s);
    }





}
