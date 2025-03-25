package com.example.service_b;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-b")
public class ServiceBController {
    @GetMapping
    public String getMessage() {
        return "Hello from Service B!";
    }
}
