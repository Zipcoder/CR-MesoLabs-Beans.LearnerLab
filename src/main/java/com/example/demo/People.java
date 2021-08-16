package com.example.demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable<PersonType> {
    private List<PersonType> personList;

    public People(PersonType... personList){
        this.personList = Arrays.asList(personList);
    }

    public void add(PersonType person){
        personList.add(person);
    }

    public void remove(PersonType person){
        personList.remove(person);
    }

    public Integer size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> pIterator){
        pIterator.forEach(personList::add);
    }

    public PersonType findById(Long id){
        for(PersonType element : personList){
            if(element.getId().equals(id)){
                return element;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }
}
