package com.zihua.dao;

import com.zihua.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zihua on 16-12-29.
 */
@Repository
public class UserDao {
    @Resource
    private SessionFactory sessionFactory;


    @SuppressWarnings("unused")
    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public List<User> getUsers() {
        return (List<User>) getSession().createCriteria(User.class).list();
    }

    public void addUser(User user) {
        this.getSession().save(user);
    }

    public void delectUserByName(String userName) {
        this.getSession().createQuery("delete User where userName= ? ").executeUpdate();
    }

    public User getUserByName(String userName) {
        return (User) this.getSession().createQuery("from User where userName = ?")
                .setParameter(0, userName).uniqueResult();
    }

    public void updateUser(User user) {
        this.getSession().update(user);
    }


    public boolean checkLogin(String name, String pass) {
        User a = (User) this.getSession().createQuery("from User where userName = ?")
                .setParameter(0, name).uniqueResult();
        if (a == null) return false;
        if (a.getPassword().equals(pass) && a.getUserName().equals(name)) return true;
        else return false;
    }
}
