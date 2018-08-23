package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.UserInfo;

public interface UserInfoService {
    public UserInfo findByUsername(String name);
}
