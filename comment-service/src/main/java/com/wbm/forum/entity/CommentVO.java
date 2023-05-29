package com.wbm.forum.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @Author：Ming
 * @Date: 2022/11/10 22:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CommentVO {

    private Integer cid;

    private Integer pid;

    private Integer floor;

    private String avatar;

    private Integer replyId;

    private String replyName;

    private Integer subCommentNum;

    private String content;

    private Integer likes;

    private String isLike;

    private LocalDateTime createTime;

    private Integer targetId;

    private Integer rootId;

}
