package com.example.demo.configurations;

import com.example.demo.models.Instructor;
import com.example.demo.models.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors (){
        return new Instructors();
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors (){
        return new Instructors();
    }

    @Primary
    @Bean (name = "instructors")
    public Instructors zcwInstructors(){
        return new Instructors(
                new Instructor(1L, "Leon Hunter"),
                new Instructor(2L, "Dolio Durant"),
                new Instructor(3L, "Kris Younger"));
    }

}
