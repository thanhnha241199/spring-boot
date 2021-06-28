package com.techgeeknext.model.comment;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class CommentDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String content;
    @Column
    private int uid;
    @Column
    private int postid;

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

    public  long getPostid(){ return postid;}

    public void getPostid(int postid) {
        this.postid = postid;
    }

}

