package com.example.demo.configurations;


import com.example.demo.models.Classroom;
import com.example.demo.models.Instructors;
import com.example.demo.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean(name = "classroom")
    @DependsOn ({"instructors", "students"})
    public Classroom currentCohort(){
        return new Classroom(new Instructors(), new Students());
    }

    @Bean(name = "classroom")
    @DependsOn ({"instructors", "previous students"})
    public Classroom previousCohort(){
        return new Classroom(new Instructors(), new Students());
    }
}
