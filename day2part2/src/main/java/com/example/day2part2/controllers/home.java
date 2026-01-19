package com.example.day2part2.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day2part2.models.StudentModel;

@RestController
public class home {
    @GetMapping("/")
    public List<StudentModel> about(){
        StudentModel student1 = new StudentModel(1, "Divyansh", "idivyanshv@gmail.com");
        StudentModel student2 = new StudentModel(2, "Aman", "aman@gmail.com");
        StudentModel student3 = new StudentModel(3, "Riya", "riya@gmail.com");
        StudentModel student4 = new StudentModel(4, "Kunal", "kunal@gmail.com");
        StudentModel student5 = new StudentModel(5, "Sneha", "sneha@gmail.com");

        return Arrays.asList(student1, student2, student3, student4, student5);
    }
}
