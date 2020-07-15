package com.example.message;

public class Sender {
    private int avatar;
    private String name;
    private String mesage;

    public Sender(int avatar, String name, String mesage) {
        this.avatar = avatar;
        this.name = name;
        this.mesage = mesage;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMesage() {
        return mesage;
    }

    public void setMesage(String mesage) {
        this.mesage = mesage;
    }
}
