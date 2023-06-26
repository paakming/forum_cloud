package com.wbm.hospital.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName schedule
 */
@TableName(value ="schedule")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Integer id;

    /**
     * 
     */
    @TableField(value = "date")
    private LocalDateTime date;

    /**
     * 
     */
    @TableField(value = "department_code")
    private String departmentCode;

    /**
     * 
     */
    @TableField(value = "doctor_id")
    private Integer doctorId;

    /**
     * 
     */
    @TableField(value = "doctor_name")
    private String doctorName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}