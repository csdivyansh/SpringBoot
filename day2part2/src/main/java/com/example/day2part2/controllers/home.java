package com.example.day2part2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
    @GetMapping("/about")
    public String about(){
        return "This is the about page.";
    }
}
