package com.Jason;

import com.Jason.pojo.User;
import com.Jason.service.MailService;
import com.Jason.service.UserService;
import com.Jason.service.UserServiceImpl;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Project06ApplicationTests {

    @Autowired
    DataSource dataSource;
   @Autowired
   UserService userService;
   @Autowired
    MailService mailService;
    @Test
    void contextLoads() throws SQLException {
//                //看一下默认数据源
//        System.out.println(dataSource.getClass());
//        //获得连接
//        Connection connection =   dataSource.getConnection();
//        System.out.println(connection);
//
//        DruidDataSource druidDataSource = (DruidDataSource) dataSource;
//        System.out.println("druidDataSource 数据源最大连接数：" + druidDataSource.getMaxActive());
//        System.out.println("druidDataSource 数据源初始化连接数：" + druidDataSource.getInitialSize());
//        System.out.println(druidDataSource.getTimeBetweenEvictionRunsMillis());
//        //关闭连接
//        connection.close();

//        User user = new User(1, "Jason","123456","2270620101@qq.com");
//        int i = userService.addUser(user);
//        System.out.println("+++++++++"+i);


    }

}
