package com.example.trialproject;


public class Model {
    private String name;
    private int status,avatar,send;

    public Model(String name, int status, int avatar, int send) {
        this.name = name;
        this.status = status;
        this.avatar = avatar;
        this.send = send;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public void setSend(int send) {
        this.send = send;
    }

    public String getName() {
        return name;
    }

    public int getStatus() {
        return status;
    }

    public int getAvatar() {
        return avatar;
    }

    public int getSend() {
        return send;
    }
}


