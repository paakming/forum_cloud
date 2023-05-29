package com.wbm.forum.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName like
 */
@TableName(value ="like")
@Data
public class Like implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "pid")
    private Integer pid;

    /**
     * 
     */
    @TableField(value = "cid")
    private Integer cid;

    /**
     * 
     */
    @TableField(value = "uid")
    private Integer uid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}