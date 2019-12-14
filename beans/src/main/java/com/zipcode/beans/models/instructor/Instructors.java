package com.zipcode.beans.models.instructor;

import com.zipcode.beans.models.person.People;
import java.util.List;

public class Instructors extends People<Instructor> {

    public Instructors(List<Instructor> personList) {
        super(personList);
    }
}
