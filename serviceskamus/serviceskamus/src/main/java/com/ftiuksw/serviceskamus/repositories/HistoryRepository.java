/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftiuksw.serviceskamus.repositories;

import com.ftiuksw.serviceskamus.models.History;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author JESSI
 */
public interface HistoryRepository extends JpaRepository<History, Integer>{
    
    @Query(value = "SELECT * FROM history WHERE user=:username ORDER BY datetime DESC ", nativeQuery = true)
    List<History> getHistoryByUsername(@Param("username") String username);
    
}
