package com.beans.learner.lab.demo;
import java.util.*;
import java.util.function.Consumer;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

     List<PersonType> personList;


    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public void  add(PersonType person) {
        this.personList.add(person);
    }

    public void remove(PersonType person){
        this.personList.remove(person);
    }

    public int size() {
        return this.personList.size();
    }

    public void clear() {
        this.personList.clear();
    }

    public void addAll(Iterable<PersonType> personList){
         this.personList.addAll((Collection<? extends PersonType>)personList);
    }

    public PersonType findById(long id) {
        for(PersonType person: personList){
            if(person.getId() == id){
                return person;
            }
        } return null;
    }

    public List<PersonType> findAll (){
        return personList;

    }
    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }


    @Override
    public void forEach(Consumer<? super PersonType> action) {

    }


    @Override
    public Spliterator<PersonType> spliterator() {
        return null;
    }

}
