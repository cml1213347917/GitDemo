package com.cml.servies;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cml.domain.User;
import com.cml.mapper.MyBatisPlusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//继承一个具体的实现类通用逻辑
public class MyBatisPlusServiesImpl extends ServiceImpl<MyBatisPlusMapper,User> implements MyBatisPlusServies {
}
