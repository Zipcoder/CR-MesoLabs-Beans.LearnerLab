package com.zipcode.beans.configstests;

import com.zipcode.beans.models.instructor.Instructors;
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
    @Qualifier("TechConnectUSAInstructors")
    Instructors USAInstructors;

    @Autowired
    @Qualifier("TechConnectUKInstructors")
    Instructors UKInstructors;

    @Autowired
    @Qualifier("instructors")
    Instructors instructors;

    @Test
    public void techConnectUSAInstructorsTest() {
        String expected1 = "Froilan";
        String expected2 = "Chris";

        String actual1 = USAInstructors.findById(1L).getName();
        String actual2 = USAInstructors.findById(2L).getName();

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void techConnectUKInstructorsTest() {
        String expected1 = "Kris";
        String expected2 = "Dolio";

        String actual1 = UKInstructors.findById(1L).getName();
        String actual2 = UKInstructors.findById(2L).getName();

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void instructorsTest() {
        String expected1 = "Tariq";
        String expected2 = "Froilan";

        String actual1 = instructors.findById(1L).getName();
        String actual2 = instructors.findById(2L).getName();

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }
}
