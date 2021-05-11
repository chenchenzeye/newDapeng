package com.Jason.controller;
import com.Jason.pojo.User;
import com.Jason.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class JsonController {

    @Autowired
    private MailService mailService;



    @RequestMapping("/sendCode")
    public Map<String,String> sendCode(HttpSession session,String email){
        mailService.sendMimeMail(email, session);
        System.out.println((String)session.getAttribute("Right_code"));
        Map<String,String> map = new HashMap<>();
        map.put("code", String.valueOf(session.getAttribute("Right_code")));
        return map;
    }
}
