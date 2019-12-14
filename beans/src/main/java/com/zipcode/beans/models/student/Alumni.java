package com.zipcode.beans.models.student;


import com.zipcode.beans.models.instructor.Instructor;
import com.zipcode.beans.models.instructor.Instructors;
import com.zipcode.beans.models.student.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;


    @PostConstruct
    public void executeBootCamp() {
        for(Instructor instructor : instructors) {
            instructor.lecture(previousStudents, (1200.0 * previousStudents.size()) / instructors.size());
        }
    }

    public Students getPreviousStudents() {
        return previousStudents;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
