package com.wbm.forum;

import com.wbm.forum.clients.CommentClient;
import com.wbm.forum.clients.UserClient;
import com.wbm.forum.config.DefaultFeignConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author：Ming
 * @Date: 2023/5/17 0:50
 */
@SpringBootApplication
@EnableFeignClients(clients = {UserClient.class, CommentClient.class},
        defaultConfiguration = DefaultFeignConfiguration.class)
public class PostApplication {
    public static void main(String[] args) {
        SpringApplication.run(PostApplication.class,args);
    }

}
