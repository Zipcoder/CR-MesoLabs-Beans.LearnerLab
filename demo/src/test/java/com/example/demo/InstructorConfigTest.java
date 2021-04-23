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
public class InstructorConfigTest {
    @Autowired
    @Qualifier("instructors")
    Instructors instructors;

    @Autowired
    @Qualifier("tcUsaInstructors")
    Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    Instructors tcUkInstructors;

    @Test
    public void instructors() {

        Assert.assertEquals("The Sleuth", instructors.findBYId(84).getName());
    }

    @Test
    public void tcUsaInstructors () {
        Assert.assertEquals("John Bob", tcUsaInstructors.findBYId(10).getName());
    }

    @Test
    public void tcUkInstructors () {
        Assert.assertEquals("Harry Sussex", tcUkInstructors.findBYId(88).getName());
    }






}
