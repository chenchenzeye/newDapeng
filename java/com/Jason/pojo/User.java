package com.Jason.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int UserID;
    private String UserName;
    private String UserPassword;
    private String UserEmail;

    public User(String userName, String userPassword, String userEmail) {
        UserName = userName;
        UserPassword = userPassword;
        UserEmail = userEmail;
    }
}
