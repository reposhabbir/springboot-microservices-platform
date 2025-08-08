package com.syed.microservices.notificationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    @GetMapping("/ping")
    public String ping() {
        return "Notification Service is up and running!";
    }
}