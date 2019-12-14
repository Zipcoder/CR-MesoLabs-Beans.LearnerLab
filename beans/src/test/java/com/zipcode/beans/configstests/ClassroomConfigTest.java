package com.zipcode.beans.configstests;

import com.zipcode.beans.models.classroom.Classroom;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassroomConfigTest {
    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;

    @Test
    public void currentCohortTest() {
        Assert.assertEquals("Tariq", currentCohort.getInstructors().findById(1L).getName());
        Assert.assertEquals("Kai", currentCohort.getStudents().findById(1L).getName());
    }

    @Test
    public void previousCohortTest() {
        Assert.assertEquals("Froilan", previousCohort.getInstructors().findById(2L).getName());
        Assert.assertEquals("Val", previousCohort.getStudents().findById(2L).getName());
    }

    @Test
    public void checkStudentsTest() {
        Integer expected = 5;

        Integer actualBest = currentCohort.getStudents().size();
        Integer actualMeh = previousCohort.getStudents().size();

        Assert.assertEquals(expected, actualBest);
        Assert.assertEquals(expected, actualMeh);
    }
}
