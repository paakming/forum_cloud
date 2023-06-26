package com.wbm.hospital.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wbm.hospital.entity.Patient;
import com.wbm.hospital.service.PatientService;
import com.wbm.hospital.mapper.PatientMapper;
import org.springframework.stereotype.Service;

/**
* @author Ming
* @description 针对表【patient】的数据库操作Service实现
* @createDate 2023-06-26 22:07:36
*/
@Service
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient>
    implements PatientService{

}




