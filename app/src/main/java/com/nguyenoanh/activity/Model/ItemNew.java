package com.nguyenoanh.activity.Model;

public class ItemNew {
    String username;
    String time;
    String content;
    String price;

    int profileImage;
    int image;

    public ItemNew(String username, String time, String content, String price, int profileImage, int image) {
        this.username = username;
        this.time = time;
        this.content = content;
        this.price = price;
        this.profileImage = profileImage;
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

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
