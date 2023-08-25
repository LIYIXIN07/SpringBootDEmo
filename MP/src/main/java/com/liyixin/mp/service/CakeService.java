package com.liyixin.mp.service;

import com.liyixin.mp.pojo.Cake;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CakeService {
    List<Cake> selectCake();

}
