package com.secretsmanager.controller;

import com.common.controller.BaseController;
import com.secretsmanager.bean.UserInfoBean;
import com.secretsmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sophiee
 */
@RestController
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 获取用户对象信息
     * @param userId
     * @return 用户对象信息
     */
    @GetMapping("/users/{userId}")
    public UserInfoBean getUser(@PathVariable("userId") String userId) {
        UserInfoBean userInfo = userService.findById(userId);
        return userInfo;
    }
}

