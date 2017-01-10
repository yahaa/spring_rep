package com.zihua.thibernate.many_to_one;

import javax.persistence.*;
import java.util.Collection;
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
    private Collection<HunterInfo> hunterInfos = new HashSet<HunterInfo>();

    public User(){

    }

    public User(String userName,String password){
        this.userName=userName;
        this.password=password;
    }

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

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "username")
    public Collection<HunterInfo> getHunterInfos() {
        return hunterInfos;
    }

    public void setHunterInfos(Collection<HunterInfo> hunterInfos) {
        this.hunterInfos = hunterInfos;
    }

<<<<<<< HEAD
    public void addArtical(HunterInfo hunterInfo){
        this.hunterInfos.add(hunterInfo);
=======
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (isAdmin != user.isAdmin) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (joinTime != null ? !joinTime.equals(user.joinTime) : user.joinTime != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (sex != null ? !sex.equals(user.sex) : user.sex != null) return false;
        if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
        return hunterInfos != null ? hunterInfos.equals(user.hunterInfos) : user.hunterInfos == null;

    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (isAdmin ? 1 : 0);
        result = 31 * result + (joinTime != null ? joinTime.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (hunterInfos != null ? hunterInfos.hashCode() : 0);
        return result;
>>>>>>> 69b8a043109f2c786b72e10619931d1232beb5d7
    }
}
