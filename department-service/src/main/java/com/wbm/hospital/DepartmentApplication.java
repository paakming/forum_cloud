package com.wbm.hospital;

import com.wbm.hospital.clients.UserClient;
import com.wbm.hospital.config.DefaultFeignConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author：Ming
 * @Date: 2023/5/17 0:50
 */
@SpringBootApplication(scanBasePackages = "com.wbm.hospital.entity")
@EnableFeignClients(clients = {UserClient.class},defaultConfiguration = DefaultFeignConfiguration.class)
public class DepartmentApplication {
    public static void main(String[] args) {
        SpringApplication.run(DepartmentApplication.class,args);
    }

}
