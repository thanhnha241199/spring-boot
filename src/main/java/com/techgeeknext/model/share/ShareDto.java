package com.techgeeknext.model.share;

public class ShareDto {
    private int id;
    private int uid;
    private int postid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
