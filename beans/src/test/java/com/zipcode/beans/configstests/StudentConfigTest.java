package com.zipcode.beans.configstests;

import com.zipcode.beans.models.student.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTest {

    @Autowired
    @Qualifier("students")
    Students students;

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;

    @Test
    public void currentStudentTest() {
        String expected1 = "Ryan";
        String expected2 = "Kendra";

        String actual1 = students.findById(3L).getName();
        String actual2 = students.findById(4L).getName();

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void previousStudentTest() {
        String expected1 = "Frankie";
        String expected2 = "April";

        String actual1 = previousStudents.findById(1L).getName();
        String actual2 = previousStudents.findById(2L).getName();

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }
}
