package com.beans.learner.lab.demo;

import com.beans.learner.lab.demo.Instructors;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest

public class TestInstructorConfig {

    @Autowired
    @Qualifier("tcUsaInstructors")
     Instructors tcUsaInstructors;
    @Autowired
    @Qualifier("tcUkInstructors")
     Instructors tcUkInstructors;
    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @Test
    public void tcUsaInstructors(){
        Assert.assertEquals("Nobles", tcUsaInstructors.findById(1L).getName());
    }

    @Test
    public void tcUkInstructors(){
        Assert.assertEquals("Dolio", tcUkInstructors.findById(4L).getName());
    }

    @Test
    public void instructors(){
        Assert.assertEquals("Roberto", instructors.findById(5L).getName());
    }



}
