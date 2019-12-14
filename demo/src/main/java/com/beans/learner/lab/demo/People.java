package com.beans.learner.lab.demo;
import java.util.*;
import java.util.function.Consumer;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

     List<PersonType> personList;


    public People(java.util.List<PersonType> personList) {
        this.personList = personList;
    }
    public void  add(PersonType personType) {
        this.personList.add(personType);
    }

    public void remove(PersonType personType){
        this.personList.remove(personType);
    }

    public int size() {
        return this.personList.size();
    }

    public void clear() {
        this.personList.clear();
    }

    public void addAll(Iterable<PersonType> personTypes){
        for(PersonType personType : personTypes)
         personList.add(personType);
    }

    public PersonType findById(long id) {
        for(PersonType p: personList){
            if(p.getId() == id){
                return p;
            }
        } return null;
    }

    public List<PersonType> findAll (){
        return personList;

    }
    @Override
    public Iterator<PersonType> iterator() {
        return null;
    }


    @Override
    public void forEach(Consumer<? super PersonType> action) {

    }


    @Override
    public Spliterator<PersonType> spliterator() {
        return null;
    }

}
