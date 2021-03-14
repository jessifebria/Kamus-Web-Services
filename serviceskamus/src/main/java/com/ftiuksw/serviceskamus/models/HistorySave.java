/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftiuksw.serviceskamus.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;

/**
 *
 * @author JESSI
 */
public class HistorySave {
    
    private String languageIdFrom;
    private String languageIdTo;
    private String messageFrom;
    private String messageTo;
    private String user;

    public HistorySave(@JsonProperty("languageIdFrom") String languageIdFrom, @JsonProperty("languageIdTo") String languageIdTo, @JsonProperty("messageFrom") String messageFrom, @JsonProperty("messageTo") String messageTo, @JsonProperty("user") String user) {
        this.languageIdFrom = languageIdFrom;
        this.languageIdTo = languageIdTo;
        this.messageFrom = messageFrom;
        this.messageTo = messageTo;
        this.user = user;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    

}
