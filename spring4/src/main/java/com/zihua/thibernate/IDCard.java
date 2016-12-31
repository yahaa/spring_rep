package com.zihua.thibernate;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by zihua on 16-12-31.
 */
@Entity
public class IDCard implements Serializable {
    private String name;
    private String pid;

    public IDCard() {

    }

    public IDCard(String name, String pid) {
        this.name = name;
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(generator = "pid")
    @GenericGenerator(name = "pid", strategy = "assigned")
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }


}
