package com.techgeeknext.model.share;

import javax.persistence.*;

@Entity
@Table(name = "share")
public class ShareDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
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

