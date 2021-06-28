package com.techgeeknext.model.comment;

public class CommentDto {
    private String content;
    private int uid;
    private int postid;

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

    public  long getPostid(){ return postid;}

    public void setPostid(int postid) {
        this.postid = postid;
    }
}
