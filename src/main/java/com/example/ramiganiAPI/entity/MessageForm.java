package com.example.ramiganiAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MessageForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String yourName;
    private String yourEmail;
    private String yourPhone;
    private String subject;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYourName() {
        return yourName;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }

    public String getYourEmail() {
        return yourEmail;
    }

    public void setYourEmail(String yourEmail) {
        this.yourEmail = yourEmail;
    }

    public String getYourPhone() {
        return yourPhone;
    }

    public void setYourPhone(String yourPhone) {
        this.yourPhone = yourPhone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}