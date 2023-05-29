package com.wbm.forum.service;

import com.wbm.forum.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wbm.forum.forum.commom.Result;

import java.util.Map;

/**
* @author Ming
* @description 针对表【user】的数据库操作Service
* @createDate 2023-05-17 01:13:59
*/
public interface UserService extends IService<User> {
    Result login(User user);

    Map<String, Object> getAllUser(Integer pageNum, Integer pageSize);

    Boolean changePwd(String oldPassword, String newPassword, String repeatPassword);

    Boolean forgetPassword(String username, String password, String email, String code);

    Boolean register(User user);
}
