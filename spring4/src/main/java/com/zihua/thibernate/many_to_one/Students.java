package com.zihua.thibernate.many_to_one;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by zihua on 16-12-26.
 */
@Entity
@Table(name = "studentmto", schema = "spring_user")
public class Students implements Serializable {
    private int id;
    private Date brithday;
    private String phone;
    private String sex;
    private String major;
    private ClassRoom room;

    public Students() {

    }

    public Students(int id, Date brithday, String phone, String sex, String major
            , ClassRoom room) {
        this.id = id;
        this.brithday = brithday;
        this.phone = phone;
        this.sex = sex;
        this.major = major;
        this.room = room;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "claId")
    public ClassRoom getRoom() {
        return room;
    }

    public void setRoom(ClassRoom room) {
        this.room = room;
    }
}
