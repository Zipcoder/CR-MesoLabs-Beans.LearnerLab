package com.beans.learner.lab.demo;
public class Classroom {
    Instructor instructorList;
    Students studentList;

    public Classroom(Instructors instructorList, Students studentList) {
        this.instructorList = instructorList;
        this.studentList = studentList;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(studentList, numberOfHours);
    }
}
