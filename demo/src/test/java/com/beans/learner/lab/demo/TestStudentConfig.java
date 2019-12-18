package com.beans.learner.lab.demo;

import com.beans.learner.lab.demo.Students;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {

    @Autowired
    @Qualifier("currentStudents")
    Students students;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;



    @Test
    public void currentStudents() {

        Assert.assertEquals("Charlotte", students.findById(1L).getName());
    }

    @Test
    public void previousStudents() {

        Assert.assertEquals("David", previousStudents.findById(5L).getName());
    }
}
