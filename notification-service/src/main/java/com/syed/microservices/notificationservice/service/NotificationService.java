package com.syed.microservices.notificationservice.service;

public interface NotificationService {
    void sendEmail(String email, String message);
}