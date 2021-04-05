/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftiuksw.serviceskamus.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author JESSI
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseData {
    private String translatedText;
    private int match;

    public ResponseData() {
    }

    public String getTranslatedText() {
        return translatedText;
    }

    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }

    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }
    
    
}
