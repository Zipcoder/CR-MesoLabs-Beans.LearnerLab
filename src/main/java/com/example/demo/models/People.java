package com.example.demo.models;

import java.util.Arrays;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<Person>{

    List<PersonType> personList;

    public People(PersonType... persons) {
        personList = Arrays.asList(persons);
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void remove(PersonType person) {
        personList.remove(person);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> people) {
        for(PersonType person : people) {
            personList.add(person);
        }
    }

    public PersonType findById(Long id) {
        for(PersonType person : personList) {
            if(person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public List<PersonType> findAll() {
        return personList;
    }
}
