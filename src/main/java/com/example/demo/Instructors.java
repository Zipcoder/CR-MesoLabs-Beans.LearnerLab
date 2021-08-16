package com.example.demo;

import java.util.List;

public class Instructors extends People<Instructor>{
    public Instructors(List<Instructor> personList) {
        super(personList);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Person next() {
        return null;
    }
}
