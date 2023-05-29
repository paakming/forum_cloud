package com.wbm.forum.clients;

import com.wbm.forum.forum.commom.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import javax.websocket.server.PathParam;

/**
 * @Author：Ming
 * @Date: 2023/5/17 23:21
 */
@FeignClient(value = "commentService")
public interface CommentClient {

    @GetMapping(value = "/{pid}")
    Result getComment(@PathVariable("pid") Integer pid, @PathParam("pageNum") Integer pageNum,
                      @PathParam("pageSize") Integer pageSize);


}
