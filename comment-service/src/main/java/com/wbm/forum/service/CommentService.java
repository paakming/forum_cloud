package com.wbm.forum.service;

import com.wbm.forum.entity.Comment;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
* @author Ming
* @description 针对表【comment】的数据库操作Service
* @createDate 2023-05-17 16:11:21
*/
public interface CommentService extends IService<Comment> {
    Map<String,Object> getComment(Integer pid, Integer pageNum, Integer pageSize);

    Boolean doComment(Comment comment);
}
