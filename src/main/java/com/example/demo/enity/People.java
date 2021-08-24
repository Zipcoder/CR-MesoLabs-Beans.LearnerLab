package com.example.demo.enity;

import com.example.demo.Learner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{

    List<E> personList = new ArrayList<E>();

    public People(List<E> personList) {
        this.personList = personList;
    }

    public People() {

    }

    public void add(E person) {
        personList.add(person);
    }

    public E findByID(Long id) {
        for (E person : personList)
            if (person.getId() == (id))
                return person;
        return null;
    }

    public List findAll(){
        return personList;
    }

    public boolean contains(E person) {
        if(personList.contains(person))
            return true;
        return false;
    }

    public void remove(E person) {
        if(contains(person)) {
            personList.remove(person);
        }
    }

    public void removeById(Long id) {
        E person = findByID(id);
        remove(person);
    }

    public void clear() {
        personList.clear();
    }

    public Integer size(){
        return personList.size();
    }

    public Integer count() {
        return personList.size();
    }

    public abstract E[] getArray();

    public void addAll(Iterable<Person> iterable){
        Iterator iterator=iterable.iterator();
        while (iterator.hasNext()) {
            personList.add((E) iterator.next());
        }
    }

    public Iterator<E> iterator() {
        return personList.iterator();
    }

}