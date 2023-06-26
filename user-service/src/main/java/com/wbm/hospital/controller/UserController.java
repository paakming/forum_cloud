package com.wbm.hospital.controller;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wbm.hospital.entity.User;
import com.wbm.hospital.forum.commom.Code;
import com.wbm.hospital.forum.commom.Result;
import com.wbm.hospital.forum.utils.RedisUtils;
import com.wbm.hospital.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author：Ming
 * @Date: 2023/5/16 23:57
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/user")
@Slf4j
public class UserController {

    private final UserService userService;
    private final RedisUtils redisUtils;

    @GetMapping
    public Result getUser(){
        System.out.println("1111");
        return Result.success(Code.SUCCESS.getCode(), Code.SUCCESS.getMsg(),null);
    }

    @GetMapping("/all")
    public Result allUser(@PathParam("pageNum") Integer pageNum, @PathParam("pageSize") Integer pageSize){
        Page<User> page = userService.page(new Page<>(pageNum, pageSize), new LambdaQueryWrapper<User>().eq(User::getStatus, "1"));
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("user",page.getRecords());
        map.put("total",page.getTotal());
        return Result.success(Code.SUCCESS.getCode(), Code.SUCCESS.getMsg(),map);
    }

    @PostMapping
    public Result addUser(@RequestBody User user){
        log.info("${}=====",user);
        if (StrUtil.isBlank(user.getPassword()) ){
            user.setPassword("000000");
        }
        Boolean register = userService.save(user);
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
//        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
//        queryWrapper.eq(User::getNickname,userDTO.getNickname());
//        User one = userService.getOne(queryWrapper);
//        if (ObjectUtil.isNotEmpty(one)&& !(one.getUid().equals(userDTO.getUid()))){
//            throw new MyServiceException(Code.ERROR_UPDATE.getCode(),"昵称已存在");
//        }
//        User user = BeanCopyUtils.copyBean(userDTO, User.class);
//        boolean res = userService.updateById(user);
//        if (res){
//            User byId = userService.getById(user.getUid());
//            redisUtils.hset("userMap",byId.getUid().toString(),byId);
//            return Result.success(Code.SUCCESS.getCode(), "修改成功",byId);
//        }else {
//            return Result.error(Code.ERROR_UPDATE.getCode(), Code.ERROR_UPDATE.getMsg());
//        }
        return null;
    }


}
