package com.example.demo;

import org.junit.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.beans.learner.lab.demo.*;
import java.util.*;

    public class AlumniTest {
        @Autowired
        private Alumni alumni;

        List<Student> previousStudentList;
        List<Instructor> instructorList;
        Students students;
        Instructors instructors;

        @Before
        public void setUp() throws Exception {
            //Test 2 students, 3 instructors
            previousStudentList = new ArrayList<>();
            previousStudentList.add(new Student(1L, "Charlotte"));
            previousStudentList.add(new Student(2L, "Chung"));

            instructorList = new ArrayList<>();
            instructorList.add(new Instructor(3L, "Dolio"));
            instructorList.add(new Instructor(4L, "Frolio"));
            instructorList.add(new Instructor(5L, "Nobles"));

            students = new Students(previousStudentList);
            instructors = new Instructors(instructorList);
            alumni = new Alumni(students, instructors);
        }

        @After
        public void tearDown() throws Exception {
        }

        @Test
        public void executeBootCampTest() {
            for(Student s: alumni.getPreviousStudents()) {
                Assert.assertEquals(1200.0, s.getTotalStudyTime(), 0.000001);
            }


        }


}
