package com.javaee.feign.controllers;

import com.javaee.feign.integrations.GreetingIntegration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    private GreetingIntegration greetingIntegration;

    public HomeController(GreetingIntegration greetingIntegration) {
        this.greetingIntegration = greetingIntegration;
    }

    @GetMapping("/home")
    public String home() {
        return greetingIntegration.greeting();
    }
}
