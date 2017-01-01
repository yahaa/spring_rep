package com.zihua.thibernate.one_to_one;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by zihua on 16-12-26.
 * 一对一双向映射关系,Students 是主控方,
 * Students 中要有 被控方的主键 @OneToOne(cascde=CascadeType.ALL)
 * cascde 表示级联关系
 * @JoinColumn(name="pid",unique=true)
 * IDCard 是被控方,被控方中要有 @OneToOne(mappedBy = "card")
 * @EmbeddedId主要用于联合主键
 */
@Entity
@Table(name = "student_t", schema = "spring_user")
public class Students implements Serializable {
    private int id;
    private Date brithday;
    private String phone;
    private String sex;
    private String major;
    private transient int non;
    private Address address;

    private IDCard card;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pid", unique = true)
    public IDCard getCard() {
        return card;
    }

    public void setCard(IDCard card) {
        this.card = card;
    }

    @Transient
    public int getNon() {
        return non;
    }


    public void setNon(int non) {
        this.non = non;
    }


    @EmbeddedId
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public Students() {

    }

    public Students(int id, Date brithday, String phone, String sex, String major,
                    int non, Address address, IDCard card) {
        this.id = id;
        this.brithday = brithday;
        this.phone = phone;
        this.sex = sex;
        this.major = major;
        this.non = non;
        this.address = address;
        this.card = card;
    }

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
}
