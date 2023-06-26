package com.wbm.hospital.controller;

import com.alibaba.fastjson.JSONObject;
import com.wbm.hospital.forum.commom.Code;
import com.wbm.hospital.forum.commom.Result;
import com.wbm.hospital.forum.utils.RedisUtils;
import com.wbm.hospital.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * @Author：Ming
 * @Date: 2022/11/19 14:39
 */
@RestController
@RequestMapping(value = "/comment")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private RedisUtils redisUtils;


    @GetMapping(value = "/{pid}")
    public Result getComment(@PathVariable Integer pid,@PathParam("pageNum") Integer pageNum, @PathParam("pageSize") Integer pageSize){

        return  Result.success(Code.SUCCESS.getCode(),Code.SUCCESS.getMsg(),null);
    }

    @PostMapping
    public Result doComment(@RequestBody JSONObject jsonObject){
//        Integer pid = jsonObject.getInteger("pid");
//        String content = jsonObject.getString("content");
//        Integer uid = jsonObject.getInteger("uid");
//        if (pid == null || uid == null || StrUtil.isBlank(content)){
//            throw new MyServiceException(Code.ERROR.getCode(),"回复帖子失败");
//        }
//        Comment comment = new Comment();
//        comment.setContent(content).setPid(pid).setReplyId(uid).setLikes(0L);
//        Boolean res = commentService.doComment(comment);
//        if (res){
//            Post post = new Post();
//            post.setPid(pid).setUpdateTime(LocalDateTimeUtil.now());
//            postMapper.updateById(post);
//            return  Result.success(Code.SUCCESS.getCode(),Code.SUCCESS.getMsg());
//        }else {
//            return  Result.success(Code.ERROR_ADD.getCode(),"回复失败");
//        }
        return null;
    }


    @DeleteMapping(value = "/{cid}")
    public Result deleteComment(@PathVariable Integer cid){
        departmentService.removeById(cid);
//        commentService.deleteComment(cid);
        return  Result.success(Code.SUCCESS.getCode(),"删除成功");
    }

}
