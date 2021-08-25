package com.example.demo.enity;

import com.example.demo.Learner;
import com.example.demo.Teacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Instructor extends Person implements Teacher {

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
//important part to remember
    private List<Learner> iterableToList(Iterable<? extends Learner> learners) {
        Iterator iterator= learners.iterator();
        List<Learner> actualList = new ArrayList<>();
        while (iterator.hasNext()) {
            actualList.add((Learner) iterator.next());
        }
        return actualList;
    }
    }
