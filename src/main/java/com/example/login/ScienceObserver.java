package com.example.login;

import javax.persistence.Entity;

@Entity
public class ScienceObserver extends User {
    private String certificate;

    public String getCetificate() {
        return certificate;
    }
    public void setCertificate(String Certificate) { this.certificate = Certificate;}
}