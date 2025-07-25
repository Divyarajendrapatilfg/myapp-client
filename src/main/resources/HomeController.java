package com.divya.myapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${welcome.message}")
    private String welcomeMessage;

    @GetMapping("/")
    public String home() {
        return welcomeMessage;
    }
}
