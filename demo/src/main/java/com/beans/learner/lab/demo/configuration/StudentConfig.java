package com.beans.learner.lab.demo.configuration;
import com.beans.learner.lab.demo.*;
import java.util.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public com.beans.learner.lab.demo.Students currentStudents() {
        Student student1 = new Student(1L, "Charlotte");
        Student student2 = new Student(2L, "Chung");
        Student student3 = new Student(3L, "Josh");
        List<Student> cohort52 = new ArrayList<>();
        cohort52.add(student1);
        cohort52.add(student2);
        cohort52.add(student3);
        return new Students(cohort52);
    }

    @Bean(name = "previousStudents")
    public com.beans.learner.lab.demo.Students previousStudents() {
        Student student4 = new Student(4L, "Eddie");
        Student student5 = new Student(5L, "David");
        Student student6 = new Student(6L, "Jack");

        List<Student> cohort51 = new ArrayList<>();
        cohort51.add(student4);
        cohort51.add(student5);
        cohort51.add(student6);
        return new Students(cohort51);
    }


}
