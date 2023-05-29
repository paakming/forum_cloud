package com.wbm.forum.service;

import com.wbm.forum.entity.Post;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wbm.forum.entity.PostVO;

import java.util.Map;

/**
* @author Ming
* @description 针对表【post】的数据库操作Service
* @createDate 2023-05-17 00:52:26
*/
public interface PostService extends IService<Post> {

    Map<String, Object> getAllPost(Integer pageNum, Integer pageSize);

    PostVO getPost(Integer pid);

    Map<String, Object> getPostByUid(Integer uid, Integer pageNum, Integer pageSize);

    Integer addPost(Post post);

    void deletePost(Integer pid);
}
