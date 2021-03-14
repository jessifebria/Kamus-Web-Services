/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftiuksw.serviceskamus.services;

import com.ftiuksw.serviceskamus.models.History;
import com.ftiuksw.serviceskamus.repositories.HistoryRepository;
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
public class HistoryService {
    
    @Autowired
    HistoryRepository repo;
    
    
    
    public List<History> getAll() {
        return repo.findAll();
    }
    
    public History save(History history) {
        return repo.save(history);
    }

    public History get(Integer id) {
        return repo.findById(id).get();
    }
    
    public List<History> getHistoryByUsername(String username) {
        return repo.getHistoryByUsername(username);
    }

}
