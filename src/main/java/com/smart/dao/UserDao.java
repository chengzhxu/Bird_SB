package com.smart.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserDao {

//    @Insert("insert ")
    int addUser(UserEntity user);

//    void del(UserEntity user);
//
//    void update(UserEntity user);

//    @Select("select * from users where id=#{id}")
    UserEntity findById(int id);

    List<UserEntity> getUsers();

}
