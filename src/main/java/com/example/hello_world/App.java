package com.example; // Ensure this matches your project structure

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {  // Class name should not include .java
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
