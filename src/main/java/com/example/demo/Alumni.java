package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    Instructors instructors;

    @Autowired
    @Qualifier("previousStudents")
    Students students;

    double numberOfHoursToTeachEachStudent = 1200;

    @Autowired
    public Alumni(Instructors instructors, @Qualifier("previousStudents") Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    @PostConstruct
    public void executeBootcamp() {
        for(Instructor instructor : instructors.findAll()) {
            instructor.lecture(students.findAll(), totalHoursPerInstructor());
        }
    }

    public int numberOfStudents() {
        return students.size();
    }

    public int numberOfInstructors() {
        return instructors.size();
    }

    public double hoursPerInstructor() {
        return numberOfHoursToTeachEachStudent / numberOfInstructors();
    }

    public double totalHoursPerInstructor() {
        return hoursPerInstructor() * numberOfStudents();
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public double getNumberOfHoursToTeachEachStudent() {
        return numberOfHoursToTeachEachStudent;
    }

    public void setNumberOfHoursToTeachEachStudent(double numberOfHoursToTeachEachStudent) {
        this.numberOfHoursToTeachEachStudent = numberOfHoursToTeachEachStudent;
    }
}
