package com.beans.learner.lab.demo;
 import java.util.*;

public class Instructor extends Person implements Teacher{
    Iterable<? extends Learner> learners;

    public Instructor(Long id, String name) {
        super(id, name);
        learners = new ArrayList<>();
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    private int getSize(Iterable<? extends Learner> learners) {
        int size = 0;
        for(Learner learner : learners) {
            size++;
        }
        return size;
    }



    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        for (Learner learner : learners) {
            teach(learner, numberOfHours / getSize(learners));
        }
    }
}
