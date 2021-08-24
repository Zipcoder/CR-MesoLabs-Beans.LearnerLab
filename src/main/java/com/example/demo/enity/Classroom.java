package com.example.demo.enity;

import com.example.demo.Teacher;

public class Classroom {
    Instructors instructors;
    Students students;

    public Classroom(Instructors instructors,Students students){
        this.instructors=instructors;
        this.students=students;
    }

    public void hostLecture(Teacher teacher,double numberOfHours){
        teacher.lecture(students.personList,numberOfHours);
    }
}
