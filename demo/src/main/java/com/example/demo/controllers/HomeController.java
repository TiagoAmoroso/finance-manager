package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() 
    {
        return "Welcome to Finance Manager!\n\nPlease login using /login to access /secured :)";
    }

    @GetMapping("/secured")
    public String secured()
    {
        return "Welcome to Secured!\n\nAll endpoints are now accessible to you :)";
    }
}
