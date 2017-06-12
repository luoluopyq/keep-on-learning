package com.cn.example.Redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by YIYANG on 2017/6/12.
 * append Redis Controller
 */
@RestController
public class RedisController {
    protected static Logger logger = LoggerFactory.getLogger(RedisController.class);

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Resource(name="stringRedisTemplate")
    ValueOperations<String,String> value;

    @RequestMapping("set")
    public String set(String key,String val){
        logger.info("访问Redis:key={},value={}",key,val);
        value.set(key,val);
        return "set ok";
    }
    @RequestMapping("get")
    public String get(String key){
        logger.debug("获取Redis:value=",value.get(key));
        return value.get(key);
    }

}
