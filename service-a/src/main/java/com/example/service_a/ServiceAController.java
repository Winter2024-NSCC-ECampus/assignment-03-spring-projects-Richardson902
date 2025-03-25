package com.example.service_a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-a")
public class ServiceAController {
    @GetMapping
    public String getMessage() {
        return "Hello from Service A!";
    }

}
