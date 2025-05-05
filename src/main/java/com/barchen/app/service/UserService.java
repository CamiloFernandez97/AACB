package com.barchen.app.service;

import com.barchen.app.model.User;
import com.barchen.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService{
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

@Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    //Fetch user by email

    //Check if email already exist

    //Register new user

    //Authenticate login

    //Add to bretzel count

    //Upgrade user to premium
}