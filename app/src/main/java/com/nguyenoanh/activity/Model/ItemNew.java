package com.nguyenoanh.activity.Model;

import android.graphics.drawable.Drawable;

public class ItemNew {
    public enum ItemType {
        ONE_ITEM, TWO_ITEM, THREE_ITEM;
    }

    String username;
    String time;
    String content;
    String price;

    int profileImage;
    Drawable image;

    ItemType itemType;

    public ItemNew(String username, String time, String content, String price, int profileImage, Drawable image) {
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

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
}
