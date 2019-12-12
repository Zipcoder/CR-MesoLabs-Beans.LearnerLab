package com.example.demo;
import com.example.demo.*;

public class Instructor extends Person implements Teacher{

    Learner learner;

    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);

    }


    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(Learner each : learners)
            each.learn(numberOfHours);
    }
}
