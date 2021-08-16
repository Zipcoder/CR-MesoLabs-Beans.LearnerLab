package com.example.demo;

import java.util.Iterator;
import java.util.List;

public class Instructors extends People<Instructor>{

    public Instructors(Instructor... instructors){
        super(instructors);
    }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }
}
