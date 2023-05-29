package com.wbm.forum.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName user
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private Integer uid;

    private String username;

    private String password;

    private String nickname;

    private String sex;

    private String phone;

    private Date createTime;

    private String isDelete;

    private String avatar;

    private String identity;

    private String email;

    private Date birthday;

    private static final long serialVersionUID = 1L;


}