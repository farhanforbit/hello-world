package com.hello-world;

public class LoginPageController{

    private String message = "INNOBIT";
    private String text = "JSF Web project demo";
    private String email;
    private String password;
    private String rememberMe;

    public String getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(String rememberMe) {
        this.rememberMe = rememberMe;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }