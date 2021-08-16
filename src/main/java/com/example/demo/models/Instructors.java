package com.example.demo.models;

import java.util.Iterator;

public class Instructors extends People<Instructor> {

    public Instructors(Instructor... instructors) {
        super(instructors);
    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }
}
