package com.zihua.thibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by zihua on 16-12-26.
 */
@Entity
public class Students {
    private int id;
    private String name;
    private Date brithday;
    private String phone;
    private String sex;
    private String major;

    public Students(){

    }

    public Students(int id, String name, Date brithday, String phone, String sex, String major) {
        this.id = id;
        this.name = name;
        this.brithday = brithday;
        this.phone = phone;
        this.sex = sex;
        this.major = major;
    }

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
