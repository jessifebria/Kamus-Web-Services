/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftiuksw.serviceskamus.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JESSI
 */


@Entity
@Table(name = "history")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "History.findAll", query = "SELECT h FROM History h")
    , @NamedQuery(name = "History.findById", query = "SELECT h FROM History h WHERE h.id = :id")
    , @NamedQuery(name = "History.findByLanguageIdFrom", query = "SELECT h FROM History h WHERE h.languageIdFrom = :languageIdFrom")
    , @NamedQuery(name = "History.findByLanguageIdTo", query = "SELECT h FROM History h WHERE h.languageIdTo = :languageIdTo")
    , @NamedQuery(name = "History.findByMessageFrom", query = "SELECT h FROM History h WHERE h.messageFrom = :messageFrom")
    , @NamedQuery(name = "History.findByMessageTo", query = "SELECT h FROM History h WHERE h.messageTo = :messageTo")
    , @NamedQuery(name = "History.findByDatetime", query = "SELECT h FROM History h WHERE h.datetime = :datetime")})
public class History implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "language_id_from")
    private String languageIdFrom;
    @Basic(optional = false)
    @Column(name = "language_id_to")
    private String languageIdTo;
    @Basic(optional = false)
    @Column(name = "message_from")
    private String messageFrom;
    @Basic(optional = false)
    @Column(name = "message_to")
    private String messageTo;
    @Basic(optional = false)
    @Column(name = "datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetime;
    @JsonIgnore
    @JoinColumn(name = "user", referencedColumnName = "username")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User user;

    public History() {
    }

    public History(Integer id) {
        this.id = id;
    }

//    public History(String languageIdFrom, String languageIdTo, String messageFrom, String messageTo, Date datetime, User username) {
//       
//        this.languageIdFrom = languageIdFrom;
//        this.languageIdTo = languageIdTo;
//        this.messageFrom = messageFrom;
//        this.messageTo = messageTo;
//        this.datetime = datetime;
//        this.user = username;
//    }
//    
    public History(String languageIdFrom, String languageIdTo, String messageFrom, String messageTo, User username) throws ParseException {

        this.languageIdFrom = languageIdFrom;
        this.languageIdTo = languageIdTo;
        this.messageFrom = messageFrom;
        this.messageTo = messageTo;
        this.datetime = getCurrDateInSQLFormat();
        this.user = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "username")
    @JsonIdentityReference(alwaysAsId = true)
    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof History)) {
            return false;
        }
        History other = (History) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ftiuksw.serviceskamus.models.History[ id=" + id + " ]";
    }
    
      private Date getCurrDateInSQLFormat() throws ParseException {
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = formatter.parse("2021-03-04 15:24:56");
        Calendar cal = Calendar.getInstance(); 
        cal.setTime(new Date());               
        cal.add(Calendar.HOUR_OF_DAY, 7);      
        Date date = cal.getTime();
        return date;
    }

}
