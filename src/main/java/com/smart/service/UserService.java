package com.smart.service;

import com.smart.dao.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserService {

    public UserEntity findUser(int id);

    public int addUser(UserEntity user) ;

    public List<UserEntity> getUsers();
}
