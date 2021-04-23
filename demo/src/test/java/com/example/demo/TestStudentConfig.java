package com.example.demo;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {
    @Autowired
    @Qualifier("students")
    Students currentStudents;


    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;

    @Test
    public void students() {

        Assert.assertEquals("Justin Banks", currentStudents.findBYId(1).getName());
    }
    @Test
    public void priorStudents() {

        Assert.assertEquals("This one", previousStudents.findBYId(99).getName());
    }





}
