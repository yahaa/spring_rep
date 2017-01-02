package com.zihua.thibernate.many_to_many_o;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zihua on 17-1-2.
 */
@Entity
@Table(name = "stud_t")
public class Stud {
    private String sname;
    private int sId;
    private Set<Teacher> teachers = new HashSet<Teacher>();

    public Stud() {

    }

    public Stud(int sId, String sname) {
        this.sname = sname;
        this.sId = sId;
    }

    @ManyToMany
    @JoinTable(
            name = "student_teacher_t",
            joinColumns = {@JoinColumn(name = "sId")},
            inverseJoinColumns = {@JoinColumn(name = "tId")}
    )
    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Id
    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }
}
