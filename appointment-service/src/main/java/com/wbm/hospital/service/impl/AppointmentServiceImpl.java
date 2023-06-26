package com.wbm.hospital.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wbm.hospital.entity.Appointment;
import com.wbm.hospital.service.AppointmentService;
import com.wbm.hospital.mapper.AppointmentMapper;
import org.springframework.stereotype.Service;

/**
* @author Ming
* @description 针对表【appointment】的数据库操作Service实现
* @createDate 2023-06-26 22:02:05
*/
@Service
public class AppointmentServiceImpl extends ServiceImpl<AppointmentMapper, Appointment>
    implements AppointmentService{

}




