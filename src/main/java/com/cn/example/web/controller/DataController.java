package com.cn.example.web.controller;

import com.cn.example.web.domain.Person;
import com.cn.example.web.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;
import java.util.List;

/**
 * Created by YIYANG on 2017/6/13.
 */
@RestController
public class DataController {
    protected static Logger logger= LoggerFactory.getLogger(DataController.class);

    @Autowired
    PersonRepository personRepository;
    @RequestMapping("/save")
    public Person save(String name, String pwd){
        logger.info("save 开始");
        new Person(name,pwd);
        Person p = new Person();
        p.setId("aaa");
        p.setName(name);
        p.setPwd(pwd);
        Person p1=personRepository.save(p);
        logger.info("save 结束");
        return p;
    }

}
