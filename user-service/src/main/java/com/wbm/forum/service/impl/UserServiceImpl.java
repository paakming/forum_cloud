package com.wbm.forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wbm.forum.entity.User;
import com.wbm.forum.forum.commom.Result;
import com.wbm.forum.service.UserService;
import com.wbm.forum.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
* @author Ming
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-05-17 01:13:59
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Override
    public Result login(User user) {
        return null;
    }

    @Override
    public Map<String, Object> getAllUser(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public Boolean changePwd(String oldPassword, String newPassword, String repeatPassword) {
        return null;
    }

    @Override
    public Boolean forgetPassword(String username, String password, String email, String code) {
        return null;
    }

    @Override
    public Boolean register(User user) {
        return null;
    }
}




