package com.example.login;

import javax.persistence.Entity;

@Entity
public class Astronomer extends User {
    private String Organization;

    public String getOrganization() {
        return Organization;
    }
    public void setOrganization(String Organization) {
        this.Organization = Organization;
    }
}
