package com.example.demo.configurations;

import com.example.demo.models.Classroom;
import com.example.demo.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents(){
        return new Students();
    }

    @Bean (name = "previous students")
    public Students previousStudents(){
        return Classroom.getStudents();
    }

}
