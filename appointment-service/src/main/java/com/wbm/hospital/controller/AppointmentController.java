package com.wbm.hospital.controller;

import com.wbm.hospital.entity.Appointment;
import com.wbm.hospital.forum.commom.Code;
import com.wbm.hospital.forum.commom.Result;
import com.wbm.hospital.forum.utils.RedisUtils;
import com.wbm.hospital.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @Author：Ming
 * @Date: 2023/5/17 0:53
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/appointment")
public class AppointmentController {

    private final AppointmentService appointmentService;

    private final RedisUtils redisUtils;

    @GetMapping
    public Result getAllPost(@PathParam("pageNum") Integer pageNum, @PathParam("pageSize") Integer pageSize){

        return Result.success(Code.SUCCESS.getCode(), Code.SUCCESS.getMsg(),null);
    }

    @GetMapping(value = "/pid/{pid}")
    public Result getPost(@PathVariable("pid") Integer pid){

        return Result.success(Code.SUCCESS.getCode(), Code.SUCCESS.getMsg(), null);
    }

    @GetMapping(value = "/uid/{uid}")
    public Result getPostByUid(@PathVariable("uid") Integer uid,@PathParam("pageNum") Integer pageNum,
                               @PathParam("pageSize") Integer pageSize){

        return Result.success(Code.SUCCESS.getCode(), Code.SUCCESS.getMsg(),null);
    }

    @PostMapping
    public Result post(@RequestBody Appointment appointment){
        Integer result = 1;
        if (result == 1){
            return Result.success(Code.SUCCESS.getCode(), Code.SUCCESS.getMsg());
        }
        return Result.error(Code.ERROR_ADD.getCode(), "发帖失败");
    }
    @DeleteMapping(value = "/{pid}")
    public Result deletePost(@PathVariable Integer pid){

        return Result.success(Code.SUCCESS.getCode(), "删除成功");
    }

    @PostMapping(value = "/del/{ids}")
    public Result deletePosts(@PathVariable List<Integer> ids){

        return Result.success(Code.SUCCESS.getCode(),"删除成功");
    }
}
