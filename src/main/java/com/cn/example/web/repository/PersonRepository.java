package com.cn.example.web.repository;

import com.cn.example.web.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by YIYANG on 2017/6/13.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    List<Person> findByName(String name);
    List<Person> findByPwd(String pwd);
    List<Person> findByNameAndPwd(String name,String pwd);
//    @Query("select p from Person p where p.name=:name and p.pwd=:pwd")
//    List<Person> withNameAndPwdQuery(@Param("name")String Name,@Param("pwd")String Pwd);

}
