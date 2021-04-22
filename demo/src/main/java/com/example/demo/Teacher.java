package com.example.demo;

import java.util.List;

public interface Teacher {
    public void teach(Learner learner, double numberOfHours);
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours);
}
