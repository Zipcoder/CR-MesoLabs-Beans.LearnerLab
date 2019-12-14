package com.zipcode.beans.models.student;

import com.zipcode.beans.models.person.People;
import java.util.List;

public class Students extends People<Student> {

    public Students(List<Student> personList) {
        super(personList);
    }
}
