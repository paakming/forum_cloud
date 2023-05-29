package com.wbm.forum.entity;


import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Comment implements Serializable {

    private Integer cid;

    private Integer pid;

    private Integer floor;

    private Integer replyId;

    private String content;

    private LocalDateTime createTime;

    private String isDelete;

    private Long likes;

    private Integer targetId;

    private Integer rootId;

    private static final long serialVersionUID = 1L;
}