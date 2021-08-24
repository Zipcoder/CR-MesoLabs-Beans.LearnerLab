package com.example.demo.enity;

import java.util.Iterator;
import java.util.List;

public class Students extends People<Student>{
    public Students(Student... students) {
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }
}

