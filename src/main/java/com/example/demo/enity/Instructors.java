package com.example.demo.enity;

import java.util.Iterator;

public class Instructors extends People<Instructor>{

    public Instructors(Instructors... instructors){
    }


    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }
}

