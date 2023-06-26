package com.wbm.hospital.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wbm.hospital.entity.Doctor;
import com.wbm.hospital.service.DoctorService;
import com.wbm.hospital.mapper.DoctorMapper;
import org.springframework.stereotype.Service;

/**
* @author Ming
* @description 针对表【doctor】的数据库操作Service实现
* @createDate 2023-06-26 22:07:29
*/
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor>
    implements DoctorService{

}




