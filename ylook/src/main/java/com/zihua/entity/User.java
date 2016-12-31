package com.zihua.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zihua on 16-12-25.
 */

/**
 * 用户类,主键是 userName
 */
@Entity
@Table(name = "user_table")
public class User {

    private String userName;
    private String password;
    private boolean isAdmin;
    private Date joinTime;
    private String email;
    private String sex;
    private String phone;
//    private Set<HunterInfo>hunterInfos=new HashSet<HunterInfo>();

    @Id
    @Column(name = "username",nullable = false,unique = true,length = 32)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "password",nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Column(name = "join_time")
    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Column(name = "telphone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", joinTime=" + joinTime +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    //    public Set<HunterInfo> getHunterInfos() {
//        return hunterInfos;
//    }
//
//    public void setHunterInfos(Set<HunterInfo> hunterInfos) {
//        this.hunterInfos = hunterInfos;
//    }
}
