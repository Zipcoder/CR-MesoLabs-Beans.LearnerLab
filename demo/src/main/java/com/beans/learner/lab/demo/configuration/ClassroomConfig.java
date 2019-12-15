package com.beans.learner.lab.demo.configuration;


import com.beans.learner.lab.demo.*;
import org.springframework.context.annotation.*;
import org.springframework.beans.factory.annotation.Qualifier;

    @Configuration
    public class ClassroomConfig {



        @Bean
        @Qualifier("currentCohort")
        @DependsOn({"instructors", "students"})
        public Classroom currentCohort(Instructors instructors, Students students) {
            return new Classroom(instructors, students);
        }

        @Bean
        @Qualifier("previousCohort")
        @DependsOn({"instructors", "previousStudents"})
        public Classroom previousCohort(Instructors instructors, Students previousStudents) {
            return new Classroom(instructors, previousStudents);
        }
    }



