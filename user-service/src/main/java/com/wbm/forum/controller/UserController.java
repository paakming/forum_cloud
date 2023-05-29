package com.wbm.forum.controller;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wbm.forum.forum.commom.Code;
import com.wbm.forum.forum.commom.Result;
import com.wbm.forum.entity.User;
import com.wbm.forum.forum.exception.MyServiceException;
import com.wbm.forum.forum.utils.RedisUtils;
import com.wbm.forum.service.UserService;
import com.wbm.forum.forum.utils.BeanCopyUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

/**
 * @Author：Ming
 * @Date: 2023/5/16 23:57
 */
@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RedisUtils redisUtils;

    @GetMapping("/{uid}")
    public Result getUser(@PathVariable Integer uid){
        User byId = userService.getById(uid);
        return Result.success(Code.SUCCESS.getCode(), Code.SUCCESS.getMsg(),byId);
    }

    @GetMapping("/all")
    public Result allUser(@PathParam("pageNum") Integer pageNum, @PathParam("pageSize") Integer pageSize){
        Map<String, Object> allUser = userService.getAllUser(pageNum, pageSize);
        return Result.success(Code.SUCCESS.getCode(), Code.SUCCESS.getMsg(),allUser);
    }

    @PostMapping
    public Result addUser(@RequestBody User user){
        if (StrUtil.isBlank(user.getPassword()) ){
            user.setPassword("000000");
        }
        Boolean register = userService.register(user);
        if (register){
            return Result.success(Code.SUCCESS.getCode(),"添加成功");
        }
        return Result.error(Code.ERROR_ADD.getCode(),Code.ERROR_ADD.getMsg());
    }

    @DeleteMapping("/{uid}")
    public Result deleteUser(@PathVariable Integer uid){
        boolean b = userService.removeById(uid);
        if (b){
            redisUtils.hDelete("userMap",uid.toString());
            return Result.success(Code.SUCCESS.getCode(),"删除成功");
        }
        return Result.error(Code.ERROR_DELETE.getCode(),Code.ERROR_DELETE.getMsg());
    }
    @PostMapping(value = "/del/{ids}")
    public Result deleteUsers(@PathVariable List<Integer> ids){
        boolean b = userService.removeByIds(ids);
        if (b){
            ids.forEach(i -> redisUtils.hDelete("userMap",i.toString()));
            return Result.success(Code.SUCCESS.getCode(),"删除成功");
        }
        return Result.error(Code.ERROR_DELETE.getCode(),Code.ERROR_DELETE.getMsg());
    }
    @PutMapping
    public Result update(@RequestBody User userDTO){
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getNickname,userDTO.getNickname());
        User one = userService.getOne(queryWrapper);
        if (ObjectUtil.isNotEmpty(one)&& !(one.getUid().equals(userDTO.getUid()))){
            throw new MyServiceException(Code.ERROR_UPDATE.getCode(),"昵称已存在");
        }
        User user = BeanCopyUtils.copyBean(userDTO, User.class);
        boolean res = userService.updateById(user);
        if (res){
            User byId = userService.getById(user.getUid());
            redisUtils.hset("userMap",byId.getUid().toString(),byId);
            return Result.success(Code.SUCCESS.getCode(), "修改成功",byId);
        }else {
            return Result.error(Code.ERROR_UPDATE.getCode(), Code.ERROR_UPDATE.getMsg());
        }
    }


}
