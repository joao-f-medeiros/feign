package com.javaee.feign.integrations;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("spring-cloud-eureka-client")
public interface GreetingIntegration {

    @GetMapping("/greeting")
    String greeting();
}
