package com.example.demo;

import com.example.demo.models.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
//why do I not need a context configuration annotation here?
public class StudentConfigTest {

    @Autowired
    @Qualifier("students")
    private Students currentClass;

    @Autowired
    @Qualifier("previous_students")
    private Students previousClass;

    @Test
    public void testCurrentStudents(){
        String actual = currentClass.findById(6L).getName();
        String expected = "Dee";
        Assert.assertEquals(actual,expected);
    }

}
