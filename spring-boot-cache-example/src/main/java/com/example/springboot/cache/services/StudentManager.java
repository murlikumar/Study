package com.example.springboot.cache.services;

import com.example.springboot.cache.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class StudentManager {
    static HashMap<Integer, Student> student = new HashMap<>();
    Logger logger = LoggerFactory.getLogger(StudentManager.class);
    static
    {
        student.put(1, new Student(100, "Alex", "Male", "Berlin"));
        student.put(2, new Student(101, "Tony", "Male", "Maxico"));
        student.put(3, new Student(102, "Andrew", "Male", "Chicago"));
        student.put(4, new Student(103, "Alexa", "Female", "Brussels"));
        student.put(5, new Student(104, "Maria", "Female", "Houston"));
    }

    @Cacheable(key="#id", condition="#id>3", value = "studentInfo")
    public Student getStudentById(Integer id)
    {
        System.out.println("Fetching student data from cache");
        logger.info("student info of id {}", id);
        return student.get(id);
    }
}
