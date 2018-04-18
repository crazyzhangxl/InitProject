package com.example.initproject.model.response;

/**
 * Created by 张先磊 on 2018/4/17.
 */

public class PsersonResponse {
    private String username;
    private String password;
    private String role;


    public PsersonResponse(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
