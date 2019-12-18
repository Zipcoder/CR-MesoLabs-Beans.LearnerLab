package com.beans.learner.lab.demo;

import com.beans.learner.lab.demo.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig {
    @Autowired
    @Qualifier("currentCohort")
    Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    Classroom previousCohort;




    @Test
    public void currentCohortTest() {
        Assert.assertEquals("Nobles", currentCohort.getInstructors().findById(1L).getName());
        Assert.assertEquals("Chung", currentCohort.getStudents().findById(2L).getName());
    }

    @Test
    public void previousCohortTest() {
        Assert.assertEquals("Frolio", previousCohort.getInstructors().findById(6L).getName());
        Assert.assertEquals("David", previousCohort.getStudents().findById(5L).getName());
    }
}
