package com.HuangZhen.model;

import java.util.Date;

public class User {
    private int ID;
    private  String Username;
    private String Password;
    private String Email;
    private String Gender;
    private Date Birthdate;

    public User() {
    }

    public User(int ID, String username, String password, String email, String gender, Date birthdate) {
        this.ID = ID;
        Username = username;
        Password = password;
        Email = email;
        Gender = gender;
        Birthdate = birthdate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date birthdate) {
        Birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", Email='" + Email + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Birthdate=" + Birthdate +
                '}';
    }
}

