package com.wbm.hospital.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wbm.hospital.entity.User;
import com.wbm.hospital.service.UserService;
import com.wbm.hospital.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Ming
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-06-26 22:07:41
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




