package com.example.goldenteamproject;

public class User {
    String pass;
    String name;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String pass, String name, String email) {
        this.pass = pass;
        this.name = name;
        this.email = email;
    }

    String email;
}
