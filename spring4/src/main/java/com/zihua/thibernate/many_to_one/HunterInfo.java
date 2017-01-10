package com.zihua.thibernate.many_to_one;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by zihua on 16-12-29.
 */
@Entity
@Table(name = "hunterinfo_table")
public class HunterInfo implements Serializable {
    private int deId;
    private User author;
    private String title;
    private String tpye;
    private int visits;
    private boolean solve = false;
    private String details;
    //private Date published = new Date();

<<<<<<< HEAD
    public HunterInfo() {

    }

    public HunterInfo(int id, String details,String title) {
        this.deId = id;
        this.details = details;
        this.title=title;
=======
    public HunterInfo(){

    }

    public HunterInfo(int deId,String title,String details){
        this.deId=deId;
        this.title=title;
        this.details=details;
    }

    public void setPublished(Date published) {
        this.published = published;
>>>>>>> 69b8a043109f2c786b72e10619931d1232beb5d7
    }

//    public void setPublished(Date published) {
//        this.published = published;
//    }

    @Id
    @GeneratedValue
    public int getDeId() {
        return deId;
    }

    public void setDeId(int deId) {
        this.deId = deId;
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "username",referencedColumnName = "username")

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Column(name = "title", nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTpye() {
        return tpye;
    }

    public void setTpye(String tpye) {
        this.tpye = tpye;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public boolean isSolve() {
        return solve;
    }

    public void setSolve(boolean solve) {
        this.solve = solve;
    }

    @Column(name = "details", nullable = false)
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

//    @Temporal(TemporalType.DATE)
//    @Column(name = "pubTime", updatable = false, nullable = false)
//    public Date getPublished() {
//        return published;
//    }

<<<<<<< HEAD
=======
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HunterInfo that = (HunterInfo) o;

        if (deId != that.deId) return false;
        if (visits != that.visits) return false;
        if (solve != that.solve) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (tpye != null ? !tpye.equals(that.tpye) : that.tpye != null) return false;
        if (details != null ? !details.equals(that.details) : that.details != null) return false;
        return published != null ? published.equals(that.published) : that.published == null;

    }

    @Override
    public int hashCode() {
        int result = deId;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (tpye != null ? tpye.hashCode() : 0);
        result = 31 * result + visits;
        result = 31 * result + (solve ? 1 : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        result = 31 * result + (published != null ? published.hashCode() : 0);
        return result;
    }
>>>>>>> 69b8a043109f2c786b72e10619931d1232beb5d7

    @Override
    public String toString() {
        return "HunterInfo{" +
                "deId=" + deId +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", tpye='" + tpye + '\'' +
                ", visits=" + visits +
                ", solve=" + solve +
                ", details='" + details + '\'' +
<<<<<<< HEAD
=======
                ", published=" + published +
>>>>>>> 69b8a043109f2c786b72e10619931d1232beb5d7
                '}';
    }
}
