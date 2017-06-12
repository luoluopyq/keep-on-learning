package com.cn.example;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YIYANG on 2017/6/12.
 * puyq
 */
@RestController
@EnableAutoConfiguration
public class HelloWorld {
    @RequestMapping("/")
    public String list(){
        return "Index page";
    }

}


