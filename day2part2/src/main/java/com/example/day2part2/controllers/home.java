package com.example.day2part2.controllers;

import com.example.day2part2.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day2part2.models.StudentModel;

@RestController
public class home {
    @GetMapping("/")
    public StudentModel about(){
        StudentModel student = new StudentModel(1, "Divyansh", "idivyanshv@gmail.com");
        return student;
    }
}
