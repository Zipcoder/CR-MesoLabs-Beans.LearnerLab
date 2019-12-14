package com.beans.learner.lab.demo.configuration;

import com.beans.learner.lab.demo.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;



@org.springframework.context.annotation.Configuration
public class InstructorConfig {
    @org.springframework.context.annotation.Bean(name = "tcUsaInstructors")
    public com.beans.learner.lab.demo.Instructors tcUsaInstructors(){
      Instructor instructor1 = new Instructor(1L, "Nobles");
        Instructor instructor2 = new Instructor(2L, "Younger");
        List<Instructor> tcUsaTeachers = new ArrayList<>();
        tcUsaTeachers.add(instructor1);
        tcUsaTeachers.add(instructor2);
        return new Instructors(tcUsaTeachers);

    }

    @org.springframework.context.annotation.Bean(name = "tcUkInstructors")
    public com.beans.learner.lab.demo.Instructors tcUkInstructors(){
        Instructor instructor4 = new Instructor(4l, "Dolio");
        Instructor instructor5 = new Instructor(5l, "Roberto");
        Instructor instructor6 = new Instructor(6l, "Frolio");
        List<Instructor> tcUkTeachers = new ArrayList<>();
        tcUkTeachers.add(instructor4);
        tcUkTeachers.add(instructor5);
        tcUkTeachers.add(instructor6);
    return new com.beans.learner.lab.demo.Instructors(tcUkTeachers);
    }

    @org.springframework.context.annotation.Primary
    @org.springframework.context.annotation.Bean(name = "instructors")
    public com.beans.learner.lab.demo.Instructors instructors(){
        ArrayList<com.beans.learner.lab.demo.Instructor>  allInstructors = new ArrayList<>();
        allInstructors.addAll(tcUsaInstructors().findAll());
        allInstructors.addAll(tcUkInstructors().findAll());
        return new com.beans.learner.lab.demo.Instructors(allInstructors);

    }

}
