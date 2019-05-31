package com.example.springbootdemo.test;

import com.example.springbootdemo.sys.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.spring5.context.SpringContextUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourecTest {

    @Autowired
    private IUserService iUserService;
    @Test
    public void test(){
        System.out.println(iUserService.selectById(1L));
    }
}
