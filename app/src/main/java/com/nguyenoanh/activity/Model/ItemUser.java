package com.nguyenoanh.activity.Model;

public class ItemUser {
    String username;
    String message;
    String time;
    String numberMess;

    int imvAvatar;
    int actionUser;
    int imageNumber;

    public ItemUser(String username, String message, String time, String numberMess,
                    int imvAvatar, int actionUser, int imageNumber) {
        this.username = username;
        this.message = message;
        this.time = time;
        this.numberMess = numberMess;
        this.imvAvatar = imvAvatar;
        this.actionUser = actionUser;
        this.imageNumber = imageNumber;
    }

    public ItemUser() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNumberMess() {
        return numberMess;
    }

    public void setNumberMess(String numberMess) {
        this.numberMess = numberMess;
    }

    public int getImvAvatar() {
        return imvAvatar;
    }

    public void setImvAvatar(int imvAvatar) {
        this.imvAvatar = imvAvatar;
    }

    public int getActionUser() {
        return actionUser;
    }

    public void setActionUser(int actionUser) {
        this.actionUser = actionUser;
    }

    public int getImageNumber() {
        return imageNumber;
    }

    public void setImageNumber(int imageNumber) {
        this.imageNumber = imageNumber;
    }
}
