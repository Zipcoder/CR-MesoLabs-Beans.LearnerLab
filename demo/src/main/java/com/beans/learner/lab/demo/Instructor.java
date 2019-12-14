package com.beans.learner.lab.demo;
import com.beans.learner.lab.demo.*;

public class Instructor extends Person implements Teacher{


    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) { learner.learn(numberOfHours); }


    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(Learner each : learners)
            each.learn(numberOfHours);
    }
}
