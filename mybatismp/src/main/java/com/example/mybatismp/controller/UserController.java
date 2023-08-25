package com.example.mybatismp.controller;

import com.example.mybatismp.dao.User;
import com.example.mybatismp.service.UserMapperService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping("/add")
    public String op(){
        return "hello world";
    }

}
