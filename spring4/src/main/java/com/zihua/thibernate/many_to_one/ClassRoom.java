package com.zihua.thibernate.many_to_one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zihua on 17-1-1.
 */
@Entity
public class ClassRoom {
    private int claId;
    private String claName;

    @Id
    @GeneratedValue
    public int getClaId() {
        return claId;
    }

    public void setClaId(int claId) {
        this.claId = claId;
    }

    public String getClaName() {
        return claName;
    }

    public void setClaName(String claName) {
        this.claName = claName;
    }
}
