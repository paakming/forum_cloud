package com.wbm.hospital.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName doctor
 */
@TableName(value ="doctor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 
     */
    @TableField(value = "name")
    private String name;

    /**
     * 
     */
    @TableField(value = "sex")
    private String sex;

    /**
     * 
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 
     */
    @TableField(value = "birthday")
    private LocalDateTime birthday;

    /**
     * 
     */
    @TableField(value = "address")
    private String address;

    /**
     * 
     */
    @TableField(value = "status")
    private String status;

    /**
     * 
     */
    @TableField(value = "certificates_type")
    private String certificatesType;

    /**
     * 
     */
    @TableField(value = "certificates_no")
    private Long certificatesNo;

    /**
     * 
     */
    @TableField(value = "department_code")
    private String departmentCode;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}