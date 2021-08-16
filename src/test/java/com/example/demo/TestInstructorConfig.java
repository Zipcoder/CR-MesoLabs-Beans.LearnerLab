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
public class TestInstructorConfig {

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors usaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors ukInstructors;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @Test
    public void testUSAInstructors(){
        String actual = usaInstructors.findById(100l).getName();
        String expected = "Leon Hunter";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testUKInstructors(){
        String actual = ukInstructors.findById(103l).getName();
        String expected = "Sir Leon Hunter";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testZCWInstructors(){
        String actual = instructors.findById(107l).getName();
        String expected = "Small Leon";

        Assert.assertEquals(expected, actual);
    }
}
