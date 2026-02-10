package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "<h1>AWS CI/CD Pipeline Success!</h1><p>The code was deployed automatically.</p>";
    }
}