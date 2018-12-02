package com.javaee.feign.services;

import com.javaee.feign.integrations.GreetingIntegration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private GreetingIntegration greetingIntegration;

    public GreetingService(GreetingIntegration greetingIntegration) {
        this.greetingIntegration = greetingIntegration;
    }

    @HystrixCommand(fallbackMethod = "defaultGreeting", commandKey = "greeting")
    public String getGreeting() {
        return greetingIntegration.greeting();
    }

    private String defaultGreeting() {
        return "Hello User!";
    }
}
