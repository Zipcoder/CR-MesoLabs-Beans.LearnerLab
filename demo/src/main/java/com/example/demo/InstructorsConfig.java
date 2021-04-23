package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors() {
        return new Instructors (
                new Instructor(10, "John Bob"),
                new Instructor(11, "Peggy Sue"),
                new Instructor(12, "Curly Mae"),
                new Instructor(13, "Peppy Patty"),
                new Instructor(14, "Sassy Sally")
        );
    }

    @Bean
    public Instructors tcUkInstructors () {
        return new Instructors(
                new Instructor(89, "Sir William Watts"),
                new Instructor(88, "Harry Sussex"),
                new Instructor(87, "William Sussex"),
                new Instructor(86, "Charles Windsor"),
                new Instructor(85, "Sarah Ferguson")
        );
    }

    @Bean @Primary
    public Instructors instructors() {
        return new Instructors(
                new Instructor(84, "The Sleuth"),
                new Instructor(83, "The Villain"),
                new Instructor(82, "The boss"),
                new Instructor(81, "Yoda"),
                new Instructor (80, "The man")
        );
    }






}
