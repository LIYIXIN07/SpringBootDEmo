package com.example.mybatismp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatismp.dao.User;
import com.example.mybatismp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserMapperService extends IService<User> {
  List<User> selectList();
}
