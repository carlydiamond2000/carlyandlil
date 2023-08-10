package com.example.carlyandlil;

public class User {
    private int Image;
    private String Username;
    private String Password;

    public User(int image, String username, String password) {
        Image = image;
        Username = username;
        Password = password;
    }

    public int getImage() {
        return Image;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }
}