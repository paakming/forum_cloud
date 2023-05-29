package com.wbm.forum.controller;

import com.wbm.forum.entity.Post;
import com.wbm.forum.entity.PostVO;
import com.wbm.forum.forum.commom.Code;
import com.wbm.forum.forum.commom.Result;
import com.wbm.forum.forum.utils.RedisUtils;
import com.wbm.forum.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

/**
 * @Author：Ming
 * @Date: 2023/5/17 0:53
 */
@RestController
@RequestMapping(value = "/post")
public class PostController {
    @Autowired
    private PostService postService;
    @Autowired
    private RedisUtils redisUtils;

    @GetMapping
    public Result getAllPost(@PathParam("pageNum") Integer pageNum, @PathParam("pageSize") Integer pageSize){
        Map<String, Object> allPost = postService.getAllPost(pageNum, pageSize);
        return Result.success(Code.SUCCESS.getCode(), Code.SUCCESS.getMsg(),allPost);
    }

    @GetMapping(value = "/pid/{pid}")
    public Result getPost(@PathVariable("pid") Integer pid){
        PostVO postVO = postService.getPost(pid);
        return Result.success(Code.SUCCESS.getCode(), Code.SUCCESS.getMsg(), postVO);
    }

    @GetMapping(value = "/uid/{uid}")
    public Result getPostByUid(@PathVariable("uid") Integer uid,@PathParam("pageNum") Integer pageNum,
                               @PathParam("pageSize") Integer pageSize){
        Map<String, Object> postByUid = postService.getPostByUid(uid, pageNum, pageSize);
        return Result.success(Code.SUCCESS.getCode(), Code.SUCCESS.getMsg(),postByUid);
    }

    @PostMapping
    public Result post(@RequestBody Post post){
        Integer result = postService.addPost(post);
        if (result == 1){
            return Result.success(Code.SUCCESS.getCode(), Code.SUCCESS.getMsg());
        }
        return Result.error(Code.ERROR_ADD.getCode(), "发帖失败");
    }
    @DeleteMapping(value = "/{pid}")
    public Result deletePost(@PathVariable Integer pid){
        postService.deletePost(pid);
        return Result.success(Code.SUCCESS.getCode(), "删除成功");
    }

    @PostMapping(value = "/del/{ids}")
    public Result deletePosts(@PathVariable List<Integer> ids){
        postService.removeByIds(ids);
        return Result.success(Code.SUCCESS.getCode(),"删除成功");
    }
}
