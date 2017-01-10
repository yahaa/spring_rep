package com.zihua.thibernate.many_to_one;

import javax.persistence.*;
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
    private boolean isAdmin = false;
    //private Date joinTime = new Date();
    private String email;
    private String sex;
    private String phone;
    private Set<HunterInfo> hunterInfos = new HashSet<HunterInfo>();

    public  User(){

    }

    public User(String name,String password){
        userName=name;
        this.password=password;

    }

//    public void setJoinTime(Date joinTime) {
//        this.joinTime = joinTime;
//    }

    @Id
    @Column(name = "username", nullable = false, unique = true, length = 32)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "password", nullable = false)
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

//    @Temporal(TemporalType.DATE)
//    @Column(name = "join_time", updatable = false, nullable = false)
//    public Date getJoinTime() {
//        return joinTime;
//    }


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
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "username")
    public Set<HunterInfo> getHunterInfos() {
        return hunterInfos;
    }

    public void setHunterInfos(Set<HunterInfo> hunterInfos) {
        this.hunterInfos = hunterInfos;
    }

    public void addArtical(HunterInfo hunterInfo){
        this.hunterInfos.add(hunterInfo);
    }
}
