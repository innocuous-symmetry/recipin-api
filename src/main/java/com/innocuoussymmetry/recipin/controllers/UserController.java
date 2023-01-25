package com.innocuoussymmetry.recipin.controllers;

import com.innocuoussymmetry.recipin.models.User;
import com.innocuoussymmetry.recipin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(Integer id) {
        Optional<User> maybe = userRepository.findById(id);
        if (maybe.isEmpty()) {
            return null;
        }

        return maybe.get();
    }
}
