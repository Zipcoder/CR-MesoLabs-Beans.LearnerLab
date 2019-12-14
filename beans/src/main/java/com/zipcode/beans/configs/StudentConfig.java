package com.zipcode.beans.configs;

import com.zipcode.beans.models.student.Student;
import com.zipcode.beans.models.student.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents(){
        Students studentsList = new Students(new ArrayList<>());
        studentsList.add(new Student(1L, "Kai"));
        studentsList.add(new Student(2L, "Val"));
        studentsList.add(new Student(3L, "Ryan"));
        studentsList.add(new Student(4L, "Kendra"));
        studentsList.add(new Student(5L, "Wes"));
        return studentsList;
    }

    @Bean(name = "previousStudents")
    public Students previousStudents(){
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student(1L, "Frankie"));
        studentsList.add(new Student(2L, "April"));
        studentsList.add(new Student(3L, "Jess"));
        studentsList.add(new Student(4L, "Chad"));
        return new Students(studentsList);
    }
}
