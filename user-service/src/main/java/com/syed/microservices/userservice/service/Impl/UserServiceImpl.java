package com.syed.microservices.userservice.service.Impl;

import com.syed.microservices.userservice.model.User;
import com.syed.microservices.userservice.repository.UserRepository;
import com.syed.microservices.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
