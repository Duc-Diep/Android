package com.example.cardview;

public class Card {
    int avatar;
    String name;
    String university;
    int popularity;
    int like;
    int rank;
    int background;

    public Card(int avatar, String name, String university, int popularity, int like, int rank, int background) {
        this.avatar = avatar;
        this.name = name;
        this.university = university;
        this.popularity = popularity;
        this.like = like;
        this.rank = rank;
        this.background = background;
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

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }
}
