package com.liyixin.mp.controller;

import com.liyixin.mp.pojo.User;
import com.liyixin.mp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/select")
public class UserController {
    @Autowired
    private UserService userService;
    @CrossOrigin

    @RequestMapping("/selectAll")
    public List<User> selectAll(){
        return userService.selectList();
    }
    @CrossOrigin
    @GetMapping("/selectId")
    public List<User> selectById(){
        return  userService.selectById();
    }

}
