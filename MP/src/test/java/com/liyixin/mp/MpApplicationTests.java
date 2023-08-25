package com.liyixin.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liyixin.mp.mapper.*;
import com.liyixin.mp.pojo.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
class MpApplicationTests {
    @Autowired
    private BlogMapper blogMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private T_accountMapper tAccountMapper;
    @Autowired
    private User user;
    @Autowired
    private UserEmailMapper userEmailMapper;



    @Test
    void contextLoads() {
        List<Blog> blogs = blogMapper.selectList(null);
        System.out.println(blogs);
        Long aLong = blogMapper.selectCount(null);
        System.out.println(aLong);
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
        Long aLong1 = userMapper.selectCount(null);
        System.out.println(aLong1);

    }
    @Test
    void CakeSelect(){
        List<T_account> tAccounts = tAccountMapper.selectList(null);
        tAccountMapper.selectCount(null);
        tAccountMapper.selectById(null);
        tAccountMapper.deleteByMap(null);
        System.out.println(tAccounts);


    }
    @Test
    void insertContent(){

        int i1 = userMapper.deleteById(1);

        System.out.println(userMapper.selectList(null));
    }
    @Test
    void updateContent(){
        User user = userMapper.selectById(1);
        System.out.println(user);
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
        System.out.println(userMapper.selectCount(null));



    }
    @Test
    void insert(){

        user.setName("李");
        user.setId(77888);
        user.setPassword("def");



        Long aLong = userMapper.selectCount(null);
        System.out.println(aLong);
        List<User> users = userMapper.selectList(null);
        System.out.println(users);




    }
    @Test
    void test(){
        QueryWrapper<User> objectQueryWrapper = new QueryWrapper<>();
       objectQueryWrapper.exists("select  id from user");
        List<User> users = userMapper.selectList(objectQueryWrapper);
        System.out.println(users);


    }

    @Test
    void insertUserEmail(){


    }
    @Test
    void test02(){

    }
    @Test
    void test22(){
        QueryWrapper<UserEmail> objectQueryWrapper = new QueryWrapper<>();
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("name","liyixin");
        objectObjectHashMap.put("email","yli136347@gmail.com");
         objectQueryWrapper.allEq(objectObjectHashMap);



    }

}
