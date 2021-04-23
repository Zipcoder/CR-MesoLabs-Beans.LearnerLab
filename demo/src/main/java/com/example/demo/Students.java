package com.example.demo;

import java.util.Arrays;
import java.util.Iterator;


public class Students extends People<Student>{


    public Students(Student ...theKids) {
       super(theKids);
    }


}
