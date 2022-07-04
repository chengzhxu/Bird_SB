package com.smart.service.impl;

import com.smart.dao.UserDao;
import com.smart.dao.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements com.smart.service.UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public UserEntity findUser(int id){
        return userDao.findById(id);
    }

    @Override
    public int addUser(UserEntity user) {
        return userDao.addUser(user);
    }

    @Override
    public List<UserEntity> getUsers(){
        return userDao.getUsers();
    }
}
