package com.zihua.thibernate.many_to_one;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by zihua on 16-12-26.
 */
@Entity
@Table(name = "studentmto", schema = "spring_user")
public class Student implements Serializable {
    private int id;
    private String name;
    private ClassRoom room;

    public Student() {

    }

    public Student(int id, String name, ClassRoom room) {
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "claId")
    public ClassRoom getRoom() {
        return room;
    }

    public void setRoom(ClassRoom room) {
        this.room = room;
    }
}
