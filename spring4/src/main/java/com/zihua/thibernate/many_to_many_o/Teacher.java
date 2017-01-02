package com.zihua.thibernate.many_to_many_o;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zihua on 17-1-2.
 */
@Entity
@Table(name="teachers_tt")
public class Teacher {
    private int tId;
    private String tname;

    public Teacher(){

    }

    public Teacher(int tId, String tname) {
        this.tId = tId;
        this.tname = tname;
    }


    @Id
    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
