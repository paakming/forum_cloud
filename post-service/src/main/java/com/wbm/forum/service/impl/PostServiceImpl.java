package com.wbm.forum.service.impl;

import cn.hutool.core.convert.Convert;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wbm.forum.clients.UserClient;
import com.wbm.forum.entity.Post;
import com.wbm.forum.entity.PostVO;
import com.wbm.forum.entity.User;
import com.wbm.forum.forum.commom.Result;
import com.wbm.forum.forum.utils.BeanCopyUtils;
import com.wbm.forum.mapper.PostMapper;
import com.wbm.forum.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
* @author Ming
* @description 针对表【post】的数据库操作Service实现
* @createDate 2023-05-17 00:52:26
*/
@Service
@Slf4j
public class PostServiceImpl extends ServiceImpl<PostMapper, Post>
    implements PostService{

    @Autowired
    private UserClient userClient;
    @Override
    public Map<String, Object> getAllPost(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PostVO getPost(Integer pid) {
        Post byId = getById(pid);
        Result result = userClient.getUser(byId.getUid());
        User user = Convert.convert(User.class, result.getData());
        PostVO postVO = BeanCopyUtils.copyBean(byId, PostVO.class);
        postVO.setAvatar(user.getAvatar()).setNickname(user.getNickname());
        return postVO;
    }

    @Override
    public Map<String, Object> getPostByUid(Integer uid, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public Integer addPost(Post post) {
        return null;
    }

    @Override
    public void deletePost(Integer pid) {

    }
}




