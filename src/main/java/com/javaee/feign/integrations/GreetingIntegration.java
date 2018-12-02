package com.javaee.feign.integrations;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("spring-cloud-eureka-client")
public interface GreetingIntegration {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    String greeting();
}
