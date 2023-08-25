package com.liyixin.mp.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liyixin.mp.mapper.CakeMapper;
import com.liyixin.mp.mapper.UserMapper;
import com.liyixin.mp.pojo.Cake;
import com.liyixin.mp.service.CakeService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CakeServiceImpl  implements CakeService {
    @Autowired
    private CakeMapper cakeMapper;
    @Override
    public List<Cake> selectCake() {
        return  cakeMapper.selectList(null);

    }


}
