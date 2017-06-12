package com.cn.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YIYANG on 2017/6/12.
 * puyq
 */
@RestController
@EnableAutoConfiguration
public class HelloWorld {
    protected static Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    @RequestMapping("/")
    public String list(){
        logger.info("访问hello list");
        return "Index page";
    }
    @RequestMapping("/hello/{name}")
    public String helloName(@PathVariable String name){
        logger.info("访问hello Name",name);
        return "Hello "+name;
    }

}


