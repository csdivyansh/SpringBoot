package com.example.Day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/hello")
    public String first() {
        return "This is the first endpoint!";
    }
    
    @GetMapping("/about")
    public String about() {
        return "this is the about page.";
    }
}
