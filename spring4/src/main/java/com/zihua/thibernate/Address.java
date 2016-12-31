package com.zihua.thibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by zihua on 16-12-31.
 */
@Embeddable
public class Address implements Serializable {
    private String location;
    private String stree;

    public String getLocation() {
        return location;
    }

    public Address(){

    }

    public Address(String location, String stree) {
        this.location = location;
        this.stree = stree;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getStree() {
        return stree;
    }

    public void setStree(String stree) {
        this.stree = stree;
    }
}
