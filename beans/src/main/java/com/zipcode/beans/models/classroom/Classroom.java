package com.zipcode.beans.models.classroom;

import com.zipcode.beans.interfaces.Teacher;
import com.zipcode.beans.models.instructor.Instructors;
import com.zipcode.beans.models.student.Students;

public class Classroom {
    private Instructors instructors;
    private Students students;

    public Classroom(Instructors instructors, Students students){
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students, numberOfHours);
    }

    public Instructors getInstructors(){ return instructors; }

    public Students getStudents(){ return students; }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public void setStudents(Students students) {
        this.students = students;
    }
}
