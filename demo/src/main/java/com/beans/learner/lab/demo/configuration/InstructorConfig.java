package com.beans.learner.lab.demo.configuration;

import com.beans.learner.lab.demo.*;
import java.util.*;
import org.springframework.context.annotation.*;
import org.springframework.beans.factory.annotation.Qualifier;


@Configuration
public class InstructorConfig {
    @Bean
    public Instructors tcUsaInstructors(){
        List<Instructor> tcUsaTeachers = new ArrayList<>();
        tcUsaTeachers.add(new Instructor(1L, "Nobles"));
        tcUsaTeachers.add(new Instructor(2L, "Younger"));
        return new Instructors(tcUsaTeachers);

    }
    @Bean
    public Instructors tcUkInstructors(){

        List<Instructor> tcUkTeachers = new ArrayList<>();
        tcUkTeachers.add(new Instructor(4L, "Dolio"));
        tcUkTeachers.add(new Instructor(5L, "Roberto"));
        tcUkTeachers.add(new Instructor(6L, "Frolio"));
    return new Instructors(tcUkTeachers);
    }
    @Bean
    @Primary
    public Instructors instructors(){
        ArrayList<Instructor>  allInstructors = new ArrayList<>();
        allInstructors.addAll(tcUsaInstructors().findAll());
        allInstructors.addAll(tcUkInstructors().findAll());
        return new Instructors(allInstructors);

    }

}
