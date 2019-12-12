package com.example.demo;
import java.util.*;
import java.util.function.Consumer;
import com.example.demo.Student;

public class Students extends People<Student> {


    public Students(List<Student> personList) {
        super(personList);
    }
}
