package com.example.demo;

public class Instructor extends Person implements Teacher {

    public void teach(Learner learner, double numberOfHours){

    }

    public void lecture(Iterable<? extends Learner> learners, double numberOfHours){
        double numberOfHoursPerLearner = numberOfHours / learners;
    }


}
