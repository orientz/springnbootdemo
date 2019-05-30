package com.baomidou.ant.sys.service.impl;

import com.baomidou.ant.sys.entity.Test;
import com.baomidou.ant.sys.mapper.TestMapper;
import com.baomidou.ant.sys.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-05-23
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
