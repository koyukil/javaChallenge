package com.example.demo.controllers;

import com.example.demo.models.userModel;
import com.example.demo.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    userService userService;

    @GetMapping()
    public ArrayList<userModel> getUser(){
        return userService.getUser();
    }

    @PostMapping()
    public userModel saveUser(@RequestBody userModel user){
        return this.userService.saveUser(user);
    }

}
