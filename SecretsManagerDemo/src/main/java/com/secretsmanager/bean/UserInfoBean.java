package com.secretsmanager.bean;

import lombok.Data;

/**
 * @author Sophiee
 */
@Data
public class UserInfoBean {
    private String userId;
    private String password;
    private String userName;
    private String age;
    private String email;
    private String telNo;
    private String address;
    private String deleteFlg;
}
