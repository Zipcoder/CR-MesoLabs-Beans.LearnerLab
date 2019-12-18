package com.beans.learner.lab.demo.configuration;

import com.beans.learner.lab.demo.*;
import java.util.*;
import org.springframework.context.annotation.*;
import org.springframework.beans.factory.annotation.Qualifier;



@Configuration
public class StudentConfig {

    @Bean(name = "currentStudents")
    public Students currentStudents() {
        List<Student> cohort52 = new ArrayList<>();
        cohort52.add(new Student(1L, "Charlotte"));
        cohort52.add(new Student(2L, "Chung"));
        cohort52.add(new Student(3L, "Josh"));
        return new Students(cohort52);
    }

    @Bean
    @Qualifier("previousStudents")
    public Students previousStudents() {
        List<Student> cohort51 = new ArrayList<>();
        cohort51.add(new Student(4L, "Eddie"));
        cohort51.add(new Student(5L, "David"));
        cohort51.add(new Student(6L, "Jack"));
        return new Students(cohort51);
    }


}
