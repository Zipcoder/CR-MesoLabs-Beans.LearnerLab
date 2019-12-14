package com.zipcode.beans.models.student;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlumniTest {

    @Autowired
    Alumni alumni;

    @Test
    public void executeBootCampTest(){
        double expected = 1200.0;

        for (Student s : alumni.getPreviousStudents()) {
            Assert.assertEquals(expected, s.getTotalStudyTime(), .01);
        }
    }
}
