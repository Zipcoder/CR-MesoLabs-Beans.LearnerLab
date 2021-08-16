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
public class ClassroomConfigTest {

    @Autowired
    @Qualifier("currentCohort")
    private Classroom currrentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;

    @Test
    public void testClassroomCurrent(){
        String expected = "Zach";
        String actual = currrentCohort.getStudents().findById(1l).getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testClassroomPrevious(){
        String expected = "Pank";
        String actual = previousCohort.getStudents().findById(4l).getName();

        Assert.assertEquals(expected, actual);
    }
}
