package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App {

    @GetMapping("/")
    public String home() {
        return "Hello from DevOps App 🚀";
    }

    @GetMapping("/api")
    public String api() {
        return "This is backend API response";
    }
}
