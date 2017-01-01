package com.zihua.thibernate.one_to_one;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by zihua on 16-12-31.
 * @Embeddable 主要是说明 Address 类是可嵌入的
 * 即,Address 所有的非 transient @Transient 都可以作为
 * 引用 Address 类对象的类 的字段
 * @Embeddable 主要用于联合主键
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
