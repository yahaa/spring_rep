package com.zihua.thibernate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zihua on 16-12-24.
 */
public class Boss {
    private String name;
    private int id;
    private Set<Employee> emps=new HashSet<Employee>();

    public Boss(){

    }

    public Boss(String name,int id){
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Employee> getEmps() {
        return emps;
    }

    public void setEmps(Set<Employee> emps) {
        this.emps = emps;
    }

    public void addEmpl(Employee emp){
        emps.add(emp);
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", emps=" + emps +
                '}';
    }
}
