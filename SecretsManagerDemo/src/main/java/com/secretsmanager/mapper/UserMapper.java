package com.secretsmanager.mapper;

import com.secretsmanager.bean.UserInfoBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Sophiee
 */
@Mapper
public interface UserMapper {
    /**
     * 通过ID获取用户信息
     * @param userId 用户ID
     * @return 用户对象
     */
    @Select("SELECT * FROM test_db.userinfo WHERE userId = #{userId}")
    UserInfoBean findById(@Param("userId") String userId);
}

