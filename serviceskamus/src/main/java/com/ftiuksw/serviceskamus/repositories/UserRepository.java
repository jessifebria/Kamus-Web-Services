/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftiuksw.serviceskamus.repositories;

import com.ftiuksw.serviceskamus.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author JESSI
 */
public interface UserRepository extends JpaRepository<User, String>{
    
}
