package com.smart.controller;

import com.smart.dao.UserEntity;
import com.smart.service.UserService;
import com.smart.tool.Response;
import com.smart.tool.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public UserEntity findUser(@RequestParam("id") int id){
        return userService.findUser(id);
    }

    @RequestMapping("/addUser")
    public int addUser(@RequestParam("name") String name){
        UserEntity user = new UserEntity();
        user.setName(name);

        return userService.addUser(user);
    }

    @RequestMapping("/getUsers")
    public ResponseResult<List<UserEntity>> getUsers(){
        return Response.makeOKRsp(userService.getUsers());
    }
}
