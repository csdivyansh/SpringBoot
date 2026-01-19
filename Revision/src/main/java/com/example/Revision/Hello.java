package com.example.Revision;

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
        return "<h1>This is the first endpoint!<h1>";
    }
    
    @GetMapping("/about")
    public String about() {
        return "this is the about page.";
    }
}
