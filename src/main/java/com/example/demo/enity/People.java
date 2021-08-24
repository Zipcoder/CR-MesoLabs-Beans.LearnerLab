package com.example.demo.enity;

import com.example.demo.Learner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{

    List<PersonType> personList;

    public People(PersonType... persons) {
        personList = Arrays.asList(persons);
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public PersonType findByID(Long id) {
        for (PersonType person : personList)
            if (person.getId() == (id))
                return person;
        return null;
    }

    public List findAll(){
        return personList;
    }

    public void remove(PersonType person) {
            personList.remove(person);
    }

    public void clear() {
        personList.clear();
    }

    public Integer size(){
        return personList.size();
    }

    public void addAll(Iterable<PersonType> iterable){
        for (PersonType person : iterable) {
            personList.add(person);
        }
    }

}