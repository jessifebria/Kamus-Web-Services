/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftiuksw.serviceskamus.controllers;

import com.ftiuksw.serviceskamus.models.History;
import com.ftiuksw.serviceskamus.models.HistorySave;
import com.ftiuksw.serviceskamus.services.HistoryService;
import com.ftiuksw.serviceskamus.services.UserService;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JESSI
 */
@RestController
public class HistoryController {
    
    @Autowired
    private HistoryService historyService;
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/history/username/{username}")
    public HashMap<String, List<History>> getHistoryByUsername(@PathVariable String username) {
        HashMap<String, List<History>> result = new HashMap<>();
        result.put("Histories",historyService.getHistoryByUsername(username));
        return result;
    }
    
    @GetMapping("/history/id/{id}")
    public HashMap<String, History> getHistoryById(@PathVariable String id){
        HashMap<String, History> result = new HashMap<>();
        result.put("History", historyService.get(Integer.parseInt(id)));
        return result;
    }
    
    @PostMapping("/history/save")
    public HashMap<String, History> save(@RequestBody HistorySave history) throws ParseException {
        HashMap<String, History> result = new HashMap<>();
        History realHistory = new History(history.getLanguageIdFrom(), history.getLanguageIdTo(), history.getMessageFrom(), history.getLanguageIdTo(), userService.get(history.getUser()));
        result.put("History", historyService.save(realHistory));
        return result;
    }
    
    
    
}
