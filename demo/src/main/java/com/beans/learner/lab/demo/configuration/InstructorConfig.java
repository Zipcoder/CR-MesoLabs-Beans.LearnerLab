package com.beans.learner.lab.demo.configuration;

import com.beans.learner.lab.demo.*;
import java.util.ArrayList;
import java.util.List;



@Configuration
public class InstructorConfig {
    @Bean(name = "tcUsaInstructors")
    public com.beans.learner.lab.demo.Instructors tcUsaInstructors(){
        com.beans.learner.lab.demo.Instructor instructor1 = new com.beans.learner.lab.demo.Instructor(1L, "Nobles");
        com.beans.learner.lab.demo.Instructor instructor2 = new com.beans.learner.lab.demo.Instructor(2L, "Younger");
        List<com.beans.learner.lab.demo.Instructor> tcUsaTeachers = new ArrayList<>();
        tcUsaTeachers.add(instructor1);
        tcUsaTeachers.add(instructor2);
        return new com.beans.learner.lab.demo.Instructors(tcUsaTeachers);

    }

    @Bean(name = "tcUkInstructors")
    public com.beans.learner.lab.demo.Instructors tcUkInstructors(){
        com.beans.learner.lab.demo.Instructor instructor4 = new com.beans.learner.lab.demo.Instructor(4l, "Dolio");
        com.beans.learner.lab.demo.Instructor instructor5 = new com.beans.learner.lab.demo.Instructor(5l, "Roberto");
        com.beans.learner.lab.demo.Instructor instructor6 = new com.beans.learner.lab.demo.Instructor(6l, "Frolio");
        List<com.beans.learner.lab.demo.Instructor> tcUkTeachers = new ArrayList<>();
        tcUkTeachers.add(instructor4);
        tcUkTeachers.add(instructor5);
        tcUkTeachers.add(instructor6);
    return new com.beans.learner.lab.demo.Instructors(tcUkTeachers);
    }

    @Primary
    @Bean(name = "instructors")
    public com.beans.learner.lab.demo.Instructors instructors(){
        ArrayList<com.beans.learner.lab.demo.Instructor>  allInstructors = new ArrayList<>();
        allInstructors.addAll(tcUsaInstructors().findAll());
        allInstructors.addAll(tcUkInstructors().findAll());
        return new com.beans.learner.lab.demo.Instructors(allInstructors);

    }

}
