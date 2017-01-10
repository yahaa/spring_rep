package com.zihua.thibernate.one_to_one;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

/**
 * Created by zihua on 16-12-31.
 * IDCard 是被控方,主控方是Studetnd
 * IDCard 中要有 @OneToOne(mappedBy="card")
 * 说明主控方的外键属性是 card
 *
 */
@Entity
public class IDCard implements Serializable {
    private String name;
    private String pid;
    private Students student;

    public IDCard() {

    }

    public IDCard(String name, String pid) {
        this.name = name;
        this.pid = pid;
    }

    @OneToOne(mappedBy = "card")
    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(generator = "pid")
    @GenericGenerator(name = "pid", strategy = "assigned")
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }


}
