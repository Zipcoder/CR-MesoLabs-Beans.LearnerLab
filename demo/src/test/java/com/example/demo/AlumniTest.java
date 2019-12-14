package com.example.demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.beans.learner.lab.demo.*;
import java.util.ArrayList;
import java.util.List;

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
            Student student1 = new Student(1L, "Charlotte");
            Student student2 = new Student(2L, "Chung");
            previousStudentList = new ArrayList<>();
            previousStudentList.add(student1);
            previousStudentList.add(student2);

            Instructor instructor1 = new Instructor(3L, "Dolio");
            Instructor instructor2 = new Instructor(4L, "Frolio");
            Instructor instructor3 = new Instructor(5L, "Nobles");
            instructorList = new java.util.ArrayList<>();
            instructorList.add(instructor1);
            instructorList.add(instructor2);
            instructorList.add(instructor3);

            students = new Students(previousStudentList);
            instructors = new Instructors(instructorList);

            alumni = new Alumni(students, instructors);
        }

        @After
        public void tearDown() throws Exception {
        }

        @Test
        public void executeBootCampTest() {


        }

        @Test
        public void getPreviousStudents() {
        }

        @Test
        public void setPreviousStudents() {
        }

        @Test
        public void getInstructors() {
        }

        @Test
        public void setInstructors() {
        }
}
