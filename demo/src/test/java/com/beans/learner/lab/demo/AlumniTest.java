package com.beans.learner.lab.demo;

import org.junit.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import com.beans.learner.lab.demo.*;
import java.util.*;
import org.junit.runner.*;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
    public class AlumniTest {
        @Autowired
        private Alumni alumni;

        @Test
        public void executeBootCampTest() {
            for(Student s: alumni.getPreviousStudents().personList) {
                Assert.assertEquals(1200.0, s.getTotalStudyTime(), 0.000001);
            }


        }


}
