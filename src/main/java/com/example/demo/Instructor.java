package com.example.demo;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours){
        learner.learn(numberOfHours);
    }

    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners;
        for (int i = 0; i < learners; i++) {
            learners[i].learn(numberOfHoursPerLearner);
        }
    }

}
