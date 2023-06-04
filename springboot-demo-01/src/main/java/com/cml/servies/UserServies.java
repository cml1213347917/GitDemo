package com.cml.servies;

import com.cml.domain.User;
import com.cml.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServies {
    @Autowired
   private  UserMapper mapper;
    public User selectUser(Integer uid){
     return mapper.selectUser(uid);
    };
}
