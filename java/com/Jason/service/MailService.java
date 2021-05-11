package com.Jason.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Random;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private UserService userService;

    @Value("${spring.mail.username}")
    private String from;

    public boolean sendMimeMail(String email, HttpSession session){
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();

            mailMessage.setSubject("验证码邮箱");

            String code = randomCode();
            session.setAttribute("Right_code",code);
            mailMessage.setText("您收到的验证码是："+code);
            mailMessage.setTo(email);
            mailMessage.setFrom(from);
            mailSender.send(mailMessage);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return  false;
        }
    }
    private String randomCode(){
        StringBuilder str = new StringBuilder();
        char[] codeChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456".toCharArray();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            str.append(codeChar[random.nextInt(codeChar.length+1)]);
        }
        return str.toString();
    }
}
