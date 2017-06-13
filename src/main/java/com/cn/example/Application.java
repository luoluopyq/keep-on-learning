package com.cn.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by YIYANG on 2017/6/12.
 * 通过@Configuration+@ComponentScan开启注解扫描并自动注册相应的注解Bean
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
