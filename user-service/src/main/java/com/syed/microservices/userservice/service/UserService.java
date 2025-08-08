package com.syed.microservices.userservice.service;

import com.syed.microservices.userservice.model.User;
import org.springframework.stereotype.Service;
import java.util.Optional;

public interface UserService {
    void saveUser(User user);
}