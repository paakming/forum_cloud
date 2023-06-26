package com.wbm.hospital.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 
 * @TableName appointment
 */
@TableName(value ="appointment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime createTime;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime updateTime;

    /**
     * 
     */
    @TableField(value = "patient_id")
    private Long patientId;

    /**
     * 
     */
    @TableField(value = "doctor_id")
    private Long doctorId;

    /**
     * 
     */
    @TableField(value = "department_id")
    private Long departmentId;

    /**
     * 
     */
    @TableField(value = "department_code")
    private String departmentCode;

    /**
     * 
     */
    @TableField(value = "cost")
    private BigDecimal cost;

    /**
     * 
     */
    @TableField(value = "status")
    private String status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}