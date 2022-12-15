package ru.ivanmurzin.newsapplication.model;

import androidx.annotation.DrawableRes;

public class News {
    private String text;
    private int likes;
    private int comments;
    private int reposts;
    @DrawableRes
    private int imageResourceId;
    private boolean isLiked = false;

    public News(String text, int likes, int comments, int reposts, int imageResourceId) {
        this.text = text;
        this.likes = likes;
        this.comments = comments;
        this.reposts = reposts;
        this.imageResourceId = imageResourceId;
    }

    public int getReposts() {
        return reposts;
    }

    public void setReposts(int reposts) {
        this.reposts = reposts;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }

    public int getComments() {
        return comments;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }


    public boolean isLiked() {
        return isLiked;
    }

    public void like() {
        if (isLiked) likes--;
        else likes++;
        isLiked = !isLiked;
    }
}
