package com.beans.learner.lab.demo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.*;

@Component
public class Alumni {

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Autowired
    private Instructors instructors;

    public Alumni(@Qualifier("previousStudents") Students previousStudents, Instructors instructors) {
        this.previousStudents = previousStudents;
        this.instructors = instructors;
    }

    @PostConstruct
    public void executeBootCamp() {
        int numberOfInstructors = instructors.size();
        int numberOfStudents = previousStudents.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

        for(Instructor instructor: instructors.personList)
            instructor.lecture(previousStudents.personList, numberOfHoursPerInstructor);
    }

    public Students getPreviousStudents() {
        return previousStudents;
    }

    public void setPreviousStudents(Students previousStudents) {
        this.previousStudents = previousStudents;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

}
