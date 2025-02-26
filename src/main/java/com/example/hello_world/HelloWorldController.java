package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @Value("${APP_COLOR:default}")  // Reads APP_COLOR from environment variables
    private String appColor;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World! The color is " + appColor;
    }
}
