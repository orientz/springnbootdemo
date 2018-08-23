package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dao.UserInfoDao;
import com.example.springbootdemo.entity.UserInfo;
import com.example.springbootdemo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String name) {
        return userInfoDao.findByUsername(name);
    }
}
