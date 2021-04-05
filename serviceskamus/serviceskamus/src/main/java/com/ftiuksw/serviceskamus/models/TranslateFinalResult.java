/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftiuksw.serviceskamus.models;

/**
 *
 * @author JESSI
 */
public class TranslateFinalResult {
 
    private String languageIdFrom;
    private String languageIdTo;
    private String messageFrom;
    private String messageTo;

    public TranslateFinalResult(String languageIdFrom, String languageIdTo, String messageFrom, String messageTo) {
        this.languageIdFrom = languageIdFrom;
        this.languageIdTo = languageIdTo;
        this.messageFrom = messageFrom;
        this.messageTo = messageTo;
    }

    public String getLanguageIdFrom() {
        return languageIdFrom;
    }

    public void setLanguageIdFrom(String languageIdFrom) {
        this.languageIdFrom = languageIdFrom;
    }

    public String getLanguageIdTo() {
        return languageIdTo;
    }

    public void setLanguageIdTo(String languageIdTo) {
        this.languageIdTo = languageIdTo;
    }

    public String getMessageFrom() {
        return messageFrom;
    }

    public void setMessageFrom(String messageFrom) {
        this.messageFrom = messageFrom;
    }

    public String getMessageTo() {
        return messageTo;
    }

    public void setMessageTo(String messageTo) {
        this.messageTo = messageTo;
    }
    
    
}
