package com.example.demo.models;

public class Classroom {
    private static Instructors instructors;
    private static Students students;

    public Classroom(Instructors instructors, Students students){
        Classroom.instructors = instructors;
        Classroom.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.findAll(), numberOfHours);

    }

    public static Instructors getInstructors() {
        return instructors;
    }

    public static Students getStudents() {
        return students;
    }
}
