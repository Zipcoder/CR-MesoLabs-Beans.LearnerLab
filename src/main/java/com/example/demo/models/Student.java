package com.example.demo.models;

import com.example.demo.Learner;
import com.example.demo.models.Person;

public class Student extends Person implements Learner {

    double totalStudyTime;

    public Student(Long id) {
        super(id);
    }

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {return totalStudyTime;}
}
