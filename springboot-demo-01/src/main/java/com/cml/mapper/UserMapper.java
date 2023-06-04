package com.cml.mapper;

import com.cml.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//@Mapper   //不需要在这里配置注解   在启动类开启扫描包就好了
public interface UserMapper {
    @Select("select * from user where uid=#{uid}")
    public User selectUser(Integer uid);
}
