package com.wbm.forum.clients;

import com.wbm.forum.forum.commom.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author：Ming
 * @Date: 2023/5/17 12:16
 */
@FeignClient(value = "userService")
public interface UserClient {

    @GetMapping("/user/{uid}")
    Result getUser(@PathVariable("uid") Integer uid);
}
