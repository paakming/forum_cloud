package com.wbm.hospital.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wbm.hospital.entity.Department;
import com.wbm.hospital.service.DepartmentService;
import com.wbm.hospital.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

/**
* @author Ming
* @description 针对表【department】的数据库操作Service实现
* @createDate 2023-06-26 22:10:51
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService{

}




