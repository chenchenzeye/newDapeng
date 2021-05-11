package com.Jason.dao;


import com.Jason.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    int addUser(User user);

    User queryUserByID(int id);

    User queryUserByUserName(String UserName);

    User queryUserByUsernameAndPassword(String UserName,String UserPassword);
}
