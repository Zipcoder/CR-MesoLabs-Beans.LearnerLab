package com.beans.learner.lab.demo.configuration;
import com.example.demo.*;
import java.util.*;
import org.springframefork.context.annotation.*;


@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public com.beans.learner.lab.demo.Students currentStudents() {
        com.beans.learner.lab.demo.Student student1 = new com.beans.learner.lab.demo.Student(1L, "Charlotte");
        com.beans.learner.lab.demo.Student student2 = new com.beans.learner.lab.demo.Student(2L, "Chung");
        com.beans.learner.lab.demo.Student student3 = new com.beans.learner.lab.demo.Student(3L, "Josh");
        List<com.beans.learner.lab.demo.Student> cohort52 = new ArrayList<>();
        cohort52.add(student1);
        cohort52.add(student2);
        cohort52.add(student3);
        return new com.beans.learner.lab.demo.Students(cohort52);
    }

    @Bean(name = "previousStudents")
    public com.beans.learner.lab.demo.Students previousStudents() {
        com.beans.learner.lab.demo.Student student4 = new com.beans.learner.lab.demo.Student(4L, "Eddie");
        com.beans.learner.lab.demo.Student student5 = new com.beans.learner.lab.demo.Student(5L, "David");
        com.beans.learner.lab.demo.Student student6 = new com.beans.learner.lab.demo.Student(6L, "Jack");

        List<com.beans.learner.lab.demo.Student> cohort51 = new ArrayList<>();
        cohort51.add(student4);
        cohort51.add(student5);
        cohort51.add(student6);
        return new com.beans.learner.lab.demo.Students(cohort51);
    }


}
