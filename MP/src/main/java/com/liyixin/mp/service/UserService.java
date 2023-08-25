package com.liyixin.mp.service;

import com.liyixin.mp.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
  List<User> selectList();
  List<User> selectById();


}
