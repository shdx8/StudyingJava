package com.gmail.ponomarenko2008.progects.model;

public class LoginUser extends Entity {
    private String login;
    private String password;


    public LoginUser() {
    }

    public LoginUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                super.toString() + " " +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
