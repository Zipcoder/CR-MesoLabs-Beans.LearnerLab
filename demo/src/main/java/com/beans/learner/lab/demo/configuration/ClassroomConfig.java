package com.beans.learner.lab.demo.configuration;

import com.beans.learner.lab.demo.*;
import org.springframework.context.annotation.*;
import org.springframework.beans.factory.annotation.Qualifier;

    @Configuration
    public class ClassroomConfig {



        @Bean("currentCohort")
        @DependsOn({"instructors", "currentStudents"})
        public Classroom currentCohort(Instructors instructors, @Qualifier("currentStudents")Students students) {
            return new Classroom(instructors, students);
        }

        @Bean

        @DependsOn({"instructors", "previousStudents"})
        public Classroom previousCohort(Instructors instructors, @Qualifier("previousStudents") Students previousStudents) {
            return new Classroom(instructors, previousStudents);
        }
    }



