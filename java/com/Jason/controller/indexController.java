package com.Jason.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class indexController {

    @GetMapping("/userLogin.html")
    public String userLogin(){
        return "userLogin";
    }

    @GetMapping("/sign_in.html")
    public String sign_in(){
        return "sign_in";
    }

    @GetMapping ("/shouldToKnow.html")
    public String shouldToKnow(){
        return "shouldToKnow";
    }

    @GetMapping("/result.html")
    public String result() {
        return "result";
    }
    @GetMapping("questionA.html")
    public String questionA(){
        return "questionA";
    }
    @GetMapping("questionB.html")
    public String questionB(){
        return "questionB";
    }
    @GetMapping("questionC.html")
    public String questionC(){
        return "questionC";
    }
    @GetMapping("questionD.html")
    public String questionD(){
        return "questionD";
    }
    @GetMapping("adminLogin.html")
    public String adminLogin(){
        return "adminLogin";
    }
}
