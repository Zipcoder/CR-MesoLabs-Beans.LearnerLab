package com.example.demo;
import com.example.demo.Person;
import com.example.demo.Learner;

public class Student extends Person implements Learner{
    double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }
}
