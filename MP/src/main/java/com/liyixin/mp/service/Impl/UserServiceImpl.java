package com.liyixin.mp.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liyixin.mp.mapper.UserMapper;
import com.liyixin.mp.pojo.User;
import com.liyixin.mp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private  UserMapper userMapper;
    @Override
    public List<com.liyixin.mp.pojo.User> selectList() {
       return  userMapper.selectList(null);
    }

    @Override
    public List<User> selectById() {
        return Collections.singletonList(userMapper.selectById(null));
    }


}
