/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftiuksw.serviceskamus.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

/**
 *
 * @author JESSI
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TranslateResult {
    private ResponseData responseData;
    private boolean quotaFinished;
    private boolean mtLangSupported;
    private String responseDetails;
    private Integer responseStatus;
    private String responderId;
    private boolean exception_code;
    private List matches;

    public TranslateResult() {
    }

    public ResponseData getResponseData() {
        return responseData;
    }

    public void setResponseData(ResponseData responseData) {
        this.responseData = responseData;
    }

    public boolean isQuotaFinished() {
        return quotaFinished;
    }

    public void setQuotaFinished(boolean quotaFinished) {
        this.quotaFinished = quotaFinished;
    }

    public boolean isMtLangSupported() {
        return mtLangSupported;
    }

    public void setMtLangSupported(boolean mtLangSupported) {
        this.mtLangSupported = mtLangSupported;
    }

    public String getResponseDetails() {
        return responseDetails;
    }

    public void setResponseDetails(String responseDetails) {
        this.responseDetails = responseDetails;
    }

    public Integer getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(Integer responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getResponderId() {
        return responderId;
    }

    public void setResponderId(String responderId) {
        this.responderId = responderId;
    }

    public boolean isException_code() {
        return exception_code;
    }

    public void setException_code(boolean exception_code) {
        this.exception_code = exception_code;
    }

    public List getMatches() {
        return matches;
    }

    public void setMatches(List matches) {
        this.matches = matches;
    }

    
}
