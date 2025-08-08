package com.syed.microservices.userservice.controller;

import com.syed.microservices.userservice.model.User;
import com.syed.microservices.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
//@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userService.saveUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {
//        return ResponseEntity.ok(userService.getUserByUsername(username));
    return null;
    }
}
