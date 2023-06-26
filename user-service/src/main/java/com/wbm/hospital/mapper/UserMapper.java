package com.wbm.hospital.mapper;

import com.wbm.hospital.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author Ming
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-06-26 22:07:41
* @Entity com.wbm.hospital.entity.User
*/
@Repository
public interface UserMapper extends BaseMapper<User> {

}




