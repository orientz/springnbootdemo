package com.example.springbootdemo.sys.service.impl;

import com.example.springbootdemo.sys.entity.User;
import com.example.springbootdemo.sys.mapper.UserMapper;
import com.example.springbootdemo.sys.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author zyy
 * @since 2019-05-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
