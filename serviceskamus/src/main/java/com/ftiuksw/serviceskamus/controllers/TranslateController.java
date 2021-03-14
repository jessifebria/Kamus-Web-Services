/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftiuksw.serviceskamus.controllers;

import com.ftiuksw.serviceskamus.models.TranslateFinalResult;
import com.ftiuksw.serviceskamus.services.TranslateService;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JESSI
 */
@RestController
public class TranslateController {

    @Autowired
    private TranslateService translateService = new TranslateService();

    @GetMapping("/translate/{from}/{to}/{sentence}")
    public HashMap<String, TranslateFinalResult> translate(@PathVariable String from, @PathVariable String to, @PathVariable String sentence) {
        HashMap<String, TranslateFinalResult> result = new HashMap<>();

        TranslateFinalResult translate = new TranslateFinalResult(from, to, sentence.replace("%20", " "), translateService.translate(from, to, sentence));
        result.put("Result", translate);
        return result;
    }

    @GetMapping("/translate/listlanguage")
    public HashMap<String, List<String>> listlanguage() {
        HashMap<String, List<String>> result = new HashMap<>();
        result.put("Languages", translateService.listlanguage());
        return result;
    }

}
