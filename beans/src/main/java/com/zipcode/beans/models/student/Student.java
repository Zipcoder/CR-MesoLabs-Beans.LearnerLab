package com.zipcode.beans.models.student;

import com.zipcode.beans.interfaces.Learner;
import com.zipcode.beans.models.person.Person;

public class Student extends Person implements Learner {

    private double totalStudyTime = 0;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
