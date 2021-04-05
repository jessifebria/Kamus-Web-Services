/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftiuksw.serviceskamus.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author JESSI
 */
class Matches {
    
    private String id;
    private String segment;
    private String translation;
    private String source;
    private String target;
    private String quality;
    private boolean reference;
    private int usage_count;
    private String subject;
    private String created_by;
    private String last_updated_by;
    private String create_date;
    private String last_update_date;
    private int match;

    public Matches(@JsonProperty("id") String id,@JsonProperty("segment") String segment, @JsonProperty("translation")String translation, @JsonProperty("source") String source, @JsonProperty("target") String target, @JsonProperty("quality") String quality, @JsonProperty("reference") boolean reference, @JsonProperty("usage-count") int usage_count, @JsonProperty("subject") String subject, @JsonProperty("created-by") String created_by,@JsonProperty("last-updated-by")  String last_updated_by, @JsonProperty("create-date") String create_date,@JsonProperty("last-update-date")  String last_update_date, @JsonProperty("match") int match) {
        this.id = id;
        this.segment = segment;
        this.translation = translation;
        this.source = source;
        this.target = target;
        this.quality = quality;
        this.reference = reference;
        this.usage_count = usage_count;
        this.subject = subject;
        this.created_by = created_by;
        this.last_updated_by = last_updated_by;
        this.create_date = create_date;
        this.last_update_date = last_update_date;
        this.match = match;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public boolean getReference() {
        return reference;
    }

    public void setReference(boolean reference) {
        this.reference = reference;
    }

    public int getUsage_count() {
        return usage_count;
    }

    public void setUsage_count(int usage_count) {
        this.usage_count = usage_count;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getLast_updated_by() {
        return last_updated_by;
    }

    public void setLast_updated_by(String last_updated_by) {
        this.last_updated_by = last_updated_by;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(String last_update_date) {
        this.last_update_date = last_update_date;
    }

    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }
    
    
    
    
}
