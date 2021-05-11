package com.Jason.service;


import com.Jason.pojo.User;




public interface UserService {

    int addUser(User user);

    User queryUserByID(int id);

    User queryUserByUsernameAndPassword(String UserName,String UserPassword);

    User queryUserByUserName(String UserName);
}
