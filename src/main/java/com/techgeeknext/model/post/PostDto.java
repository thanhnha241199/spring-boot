package com.techgeeknext.model.post;

public class PostDto {
    private String content;
    private int uid;
    private int likes;
    private int shared;
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public  long getLikes(){ return likes;}

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public  long getShared(){ return shared;}

    public void setShared(int shared) {
        this.shared = shared;
    }
}
