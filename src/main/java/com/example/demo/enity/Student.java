package com.example.demo.enity;

import com.example.demo.Learner;
import com.example.demo.enity.Person;

public class Student extends Person implements Learner {
    Double totalStudyTime;
    public Student(Long id, String name) {
        super(id, name);
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
    totalStudyTime+=numberOfHours;
    }
}
