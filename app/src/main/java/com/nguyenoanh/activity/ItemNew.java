package com.nguyenoanh.activity;

public class ItemNew {
    String username;
    String time;
    String content;
    String price;

    int avatar;
    int image;

    public ItemNew(String username, String time, String content, String price, int avatar, int image) {
        this.username = username;
        this.time = time;
        this.content = content;
        this.price = price;
        this.avatar = avatar;
        this.image = image;
    }

    public ItemNew() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
