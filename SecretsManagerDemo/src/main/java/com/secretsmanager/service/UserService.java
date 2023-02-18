package com.secretsmanager.service;

import com.secretsmanager.bean.UserInfoBean;
import org.springframework.stereotype.Service;

/**
 * @author Sophiee
 */
@Service
public interface UserService {

    /**
     * 通过用户ID获取用户信息
     * @param userId 用户ID
     * @return 用户对象
     */
    UserInfoBean findById(String userId);
}
