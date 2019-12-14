package com.zipcode.beans.models.person;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    public List<PersonType> personList;

    public People(List<PersonType> personList){
        this.personList = personList;
    }

    public void add(PersonType person){
        this.personList.add(person);
    }

    public void remove(PersonType person){
        this.personList.remove(person);
    }

    public Integer size(){
        return personList.size();
    }

    public void clear(List<PersonType> personList){
        this.personList.clear();
    }

    public void addAll(Iterable<PersonType> personList){
        this.personList.addAll((Collection<? extends PersonType>) personList);
    }

    public Person findById(Long id){
        for(PersonType person : personList){
            if(person.getId().equals(id)){
                return person;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return this.personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}
