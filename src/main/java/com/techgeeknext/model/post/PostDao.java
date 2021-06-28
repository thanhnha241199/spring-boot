package com.techgeeknext.model.post;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class PostDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String content;
    @Column
    private int uid;
    @Column
    private int likes;
    @Column
    private int shared;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

