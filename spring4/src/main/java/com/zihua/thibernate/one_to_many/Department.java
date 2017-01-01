package com.zihua.thibernate.one_to_many;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zihua on 17-1-1.
 */
@Entity
@Table(name = "department_t")
public class Department {
    private String name;
    private int departmentId;
    private Set<Staff> staffs = new HashSet<Staff>();

    public String getName() {
        return name;
    }

    public Department() {

    }

    public Department(String name, int departmentId) {
        this.name = name;
        this.departmentId = departmentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "departmentId")
    public Set<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(Set<Staff> staffs) {
        this.staffs = staffs;
    }
}
