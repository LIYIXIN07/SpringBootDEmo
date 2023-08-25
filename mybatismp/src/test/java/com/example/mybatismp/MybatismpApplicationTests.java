package com.example.mybatismp;

import com.example.mybatismp.dao.User;
import com.example.mybatismp.mapper.UserMapper;
import com.example.mybatismp.service.UserMapperService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatismpApplicationTests {
@Autowired
private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);

    }
    @Test
    void test2(){
        Long aLong = userMapper.selectCount(null);
        System.out.println(aLong);


    }
    @Test
    void  test(){
        User user = new User();
        user.setId(99L);
        user.setName("deferf");
        user.setPassword("34345");
        int insert = userMapper.insert(user);
        System.out.println(insert);
        System.out.println(userMapper.selectList(null));


    }

}
