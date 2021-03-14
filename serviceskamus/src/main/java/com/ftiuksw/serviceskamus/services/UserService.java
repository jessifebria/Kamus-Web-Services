/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftiuksw.serviceskamus.services;

import com.ftiuksw.serviceskamus.models.User;
import com.ftiuksw.serviceskamus.models.UserLogin;
import com.ftiuksw.serviceskamus.repositories.UserRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JESSI
 */
@Service
@Transactional
public class UserService {
    
    
    @Autowired
    UserRepository repo;



    public List<User> getAll() {
        return repo.findAll();
    }
    
    public User save(User user) {
        return repo.save(user);
    }

    public User get(String username) {
        return repo.findById(username).get();
    }
    
    public boolean checklogin(UserLogin user){
        String username = user.getUsername();
        String password = user.getPassword();
        if (repo.existsById(username)){
            String pass = get(username).getPassword();
            if (password.equalsIgnoreCase(pass)){
                return true;
            }
        }
        return false;
    }

    
}
