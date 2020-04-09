package com.example.spinner;

public class Student {
    String avatarpath;
    String ten;
    String lop;

    public Student(String ten, String lop) {
        this.ten = ten;
        this.lop = lop;
    }

    public void setAvatarpath(String avatarpath) {
        this.avatarpath = avatarpath;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getAvatarpath() {
        return avatarpath;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }
}
