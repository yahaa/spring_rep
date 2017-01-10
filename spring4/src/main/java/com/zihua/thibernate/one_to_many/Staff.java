package com.zihua.thibernate.one_to_many;

import javax.persistence.*;

/**
 * Created by zihua on 17-1-1.
 */
@Entity
@Table(name = "staff_t")
public class Staff {
    private String name;
    private String workId;
    private Department department;

    public Staff() {

    }

    public Staff(String name, String workId) {
        this.name = name;
        this.workId = workId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "departmentId")
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

