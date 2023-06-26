package com.wbm.hospital.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @Author：Ming
 * @Date: 2023/5/17 12:13
 */
public class DefaultFeignConfiguration {

    @Bean
    public Logger.Level logLevel(){
        return Logger.Level.NONE;
    }
}
