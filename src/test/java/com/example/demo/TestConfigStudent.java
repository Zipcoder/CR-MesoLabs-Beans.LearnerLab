package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration
public class TestConfigStudent {

    @Autowired
    @Qualifier("students")
    private Students currentCohort;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousCohort;

    @Test
    public void testCurrentStudents(){
        String actual = currentCohort.findById(1l).getName();
        String expected = "Zach";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStudents(){
        String expected = "Shank";
        String actual = previousCohort.findById(5l).getName();

        Assert.assertEquals(expected, actual);
    }
}
