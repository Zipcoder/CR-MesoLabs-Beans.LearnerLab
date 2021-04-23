package com.example.demo;

public class Classroom {

    private Instructors instruct;
    private Students studs;

    public Classroom(Instructors instruct, Students studs){
        this.instruct = instruct;
        this.studs = studs;
    }
    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(studs, numberOfHours);

    }
    
}
