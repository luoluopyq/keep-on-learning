package com.cn.example.web.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by YIYANG on 2017/6/13.
 */
@Entity
public class Person {
    @Id
//    @GeneratedValue(JPA 的主键生成策略 auto,sequence,table,Identity)
    private String id;
    private String name;
    private String pwd;

    public Person() {
        super();
    }

    public Person(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
