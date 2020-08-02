package com.example.demo.service.impl;

import com.example.demo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author sunchangting
 * @create 2020/8/2 14:49
 **/
@Service
public class DemoServiceImpl implements DemoService {
    public void test(){
        System.out.println("你好");
    }
}

