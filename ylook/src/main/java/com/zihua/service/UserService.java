package com.zihua.service;

import com.zihua.dao.UserDao;
import com.zihua.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zihua on 16-12-29.
 */
@Service
public class UserService {
    @Autowired private UserDao userDao;

    public List<User> getUsers() {
        return userDao.getUsers();
    }

    public void addUser(User user) {

        userDao.addUser(user);
    }

    public void delectUserByName(String userName) {
        userDao.delectUserByName(userName);
    }

    public User getUserByName(String userName) {
        return  userDao.getUserByName(userName);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public boolean checkLogin(String userName,String password){
        return userDao.checkLogin(userName,password);
    }
}
