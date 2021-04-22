package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable<PersonType> {

    List<PersonType> persons;

    public People(PersonType ...them) {
        this.persons = Arrays.asList(them);
    }

    public void add(PersonType them) {persons.add(them);}

    public void remove(PersonType them) {persons.remove(them);}

    public int size() {return persons.size();}

    public void addAll(Iterable<PersonType> morePersons) {
        morePersons.forEach(p -> persons.add(p));
    }

    public PersonType findBYId(Long id) {
        for (PersonType pt : persons){
            if (pt.getId() == id) {
                return pt;
            }
        }
        return null;
    }

    public List<PersonType> findAll() {
        return persons;
    }

}
