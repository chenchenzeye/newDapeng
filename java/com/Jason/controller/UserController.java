package com.Jason.controller;


import com.Jason.pojo.User;
import com.Jason.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/toSignIn")
    public String UserSignIn(User user, String V_code, HttpSession session) {
        session.setAttribute("User", user);
        if(userService.queryUserByUserName(user.getUserName())!=null){
            return "sign_in";
        }
        userService.addUser(user);
        System.out.println(user);
        System.out.println(V_code);
        return "userLogin";
    }
    @RequestMapping("/toLoginIn")
    public String login(@RequestParam("UserName") String UserName, @RequestParam("UserPassword") String UserPassword,
                        Model model, HttpSession session
    ) {
        if (userService.queryUserByUsernameAndPassword(UserName,UserPassword)==null){
            return "userLogin";
        }
        session.setAttribute("loginUser",UserName);
        return "index";
    }
}
