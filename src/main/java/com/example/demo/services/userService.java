package com.example.demo.services;

import com.example.demo.models.userModel;
import com.example.demo.repositories.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class userService {
    @Autowired
    userRepository userRepository;

    public ArrayList<userModel> getUser(){
        return (ArrayList<userModel>)userRepository.findAll();
    }

    public userModel saveUser(userModel user){
        return userRepository.save(user);
    }

//    public Optional<userModel> getByName(String name){
//        return userRepository.findByName(name);
//    }
}
