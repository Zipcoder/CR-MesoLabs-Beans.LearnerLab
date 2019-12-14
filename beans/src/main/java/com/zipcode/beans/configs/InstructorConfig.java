package com.zipcode.beans.configs;

import com.zipcode.beans.models.instructor.Instructor;
import com.zipcode.beans.models.instructor.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorConfig {

    @Bean(name = "TechConnectUSAInstructors")
    public Instructors tcUsaInstructors(){
        Instructors instructors = new Instructors(new ArrayList<>());
        instructors.add(new Instructor(1L, "Froilan"));
        instructors.add(new Instructor(2L, "Chris"));
        return instructors;
    }

    @Bean(name = "TechConnectUKInstructors")
    public Instructors tcUkInstructors(){
        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor(1L, "Kris"));
        instructorList.add(new Instructor(2L, "Dolio"));
        return new Instructors(instructorList);
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors instructors(){
        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor(1L, "Tariq"));
        instructorList.add(new Instructor(2L, "Froilan"));
        return new Instructors(instructorList);
    }
}
