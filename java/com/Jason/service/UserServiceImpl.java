package com.Jason.service;


import com.Jason.dao.UserMapper;
import com.Jason.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public User queryUserByID(int id) {
        return userMapper.queryUserByID(id);
    }

    @Override
    public User queryUserByUsernameAndPassword(String UserName, String UserPassword) {
        return userMapper.queryUserByUsernameAndPassword(UserName,UserPassword);
    }

    @Override
    public User queryUserByUserName(String UserName) {
        return userMapper.queryUserByUserName(UserName);
    }
}
