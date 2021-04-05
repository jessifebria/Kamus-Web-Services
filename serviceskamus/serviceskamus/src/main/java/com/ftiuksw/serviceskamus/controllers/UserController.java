/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftiuksw.serviceskamus.controllers;

import com.ftiuksw.serviceskamus.models.Status;
import com.ftiuksw.serviceskamus.models.User;
import com.ftiuksw.serviceskamus.models.UserLogin;
import com.ftiuksw.serviceskamus.services.UserService;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JESSI
 */
@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
    
     @GetMapping("/user/username/{username}")
    public HashMap<String, User> getUserByUsername(@PathVariable String username){
        HashMap<String, User> result = new HashMap<>();
        result.put("User", userService.get(username));
        return result;
    }
    
    @PostMapping("/user/save")
    public HashMap<String, User> save(@RequestBody User user) {
        HashMap<String, User> result = new HashMap<>();
        result.put("User", userService.save(user));
        return result;
    }
    
    @PostMapping("/user/login")
    public Status checklogin(@RequestBody UserLogin user) {
        HashMap<String, User> result = new HashMap<>();
        
        if (userService.checklogin(user)) {
            Status status = new Status("OK", userService.get(user.getUsername()));
            return status;
        } 
        
        return new Status("404", null);
    }
}
