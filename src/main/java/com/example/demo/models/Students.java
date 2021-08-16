package com.example.demo.models;


import java.util.Iterator;


public class Students extends People<Student> {

    public Students(Student... students) {
        super(students);
    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }

}
