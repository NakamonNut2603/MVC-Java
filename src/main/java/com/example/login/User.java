package com.example.login;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer UserID;
    private String Firstname;
    private String Middlename;
    private String Lastname;
    private String Username;
    private String Password;

    public Integer getUserID() {
        return UserID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastName() {
        return Lastname;
    }

    public String getMiddlename() {
        return Middlename;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public void setMiddlename(String middlename) {
        Middlename = middlename;
    }

    public void setLastName(String lastName) {
        Lastname = lastName;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
