package com.example.Day2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {
    @GetMapping("/")
    public String hello(){
        return "index";
    }
    @GetMapping("/homepage")
    public String homepage(){
        return "home";
    }
}
