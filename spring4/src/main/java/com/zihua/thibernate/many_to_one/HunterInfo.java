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
    private Date published = new Date();

    public void setPublished(Date published) {
        this.published = published;
    }

    @Id
    @GeneratedValue
    public int getDeId() {
        return deId;
    }

    public void setDeId(int deId) {
        this.deId = deId;
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "username")
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

    @Temporal(TemporalType.DATE)
    @Column(name = "pubTime", updatable = false, nullable = false)
    public Date getPublished() {
        return published;
    }


}
