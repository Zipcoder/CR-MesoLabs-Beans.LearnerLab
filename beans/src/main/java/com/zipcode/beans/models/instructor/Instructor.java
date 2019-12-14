package com.zipcode.beans.models.instructor;

import com.zipcode.beans.interfaces.Learner;
import com.zipcode.beans.interfaces.Teacher;
import com.zipcode.beans.models.person.Person;

public class Instructor extends Person implements Teacher {
    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {
        for (Learner learner : learners) {
            teach(learner, numberOfHours / getCohortSize(learners));
        }
    }

    private int getCohortSize(Iterable<? extends Learner> learners) {
        int count = 0;
        for (Learner l : learners) {
            count++;
        }
        return count;
    }
}
