package com.example.demo.models;

import com.example.demo.Learner;
import com.example.demo.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id) {
        super(id);
    }

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        List<Learner> listOfLearners = iterableToList(learners);
        for(Learner learner : listOfLearners) {
            teach(learner, (numberOfHours/listOfLearners.size()));
        }
    }

    public List<Learner> iterableToList(Iterable<? extends Learner> learners) {
        List<Learner> listOfLearners= new ArrayList<>();
        for(Learner learner : learners) {
            listOfLearners.add(learner);
        }
        return listOfLearners;
    }
}
