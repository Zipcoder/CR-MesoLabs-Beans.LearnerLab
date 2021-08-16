package com.example.demo;

import java.util.Iterator;
import java.util.List;

public class Instructors extends People<Instructor>{

    public Instructors(List<Instructor> instructorList) {
        super(instructorList);
    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }
}
