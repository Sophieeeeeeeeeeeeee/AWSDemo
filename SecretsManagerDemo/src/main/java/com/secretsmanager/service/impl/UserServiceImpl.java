package com.secretsmanager.service.impl;

import com.secretsmanager.bean.UserInfoBean;
import com.secretsmanager.mapper.UserMapper;
import com.secretsmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Sophiee
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfoBean findById(String userId) {
        return userMapper.findById(userId);
    }
}
