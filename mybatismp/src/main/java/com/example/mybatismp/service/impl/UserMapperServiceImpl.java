package com.example.mybatismp.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatismp.dao.User;
import com.example.mybatismp.mapper.UserMapper;
import com.example.mybatismp.service.UserMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
@Service
public class UserMapperServiceImpl  extends ServiceImpl<UserMapper,User> implements UserMapperService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectList() {
        return  userMapper.selectList(null);
    }


}
