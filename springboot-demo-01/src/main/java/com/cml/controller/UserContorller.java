package com.cml.controller;

import com.cml.domain.User;
import com.cml.servies.UserServies;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@Api(tags= "用户相关接口",description = "用户查询接口")
public class UserContorller {
    @Autowired
    private UserServies servies;
    @GetMapping("selectuser")
    @ResponseBody
    @ApiOperation("根据id查询用户信息")
//    @ApiIgnore//忽略这个接口
    @ApiImplicitParam(name = "uid",value = "用户id")//解释另一些参数
    public User selectUser(Integer uid){
        System.out.println();
        System.out.println("controller执行");
        User user = servies.selectUser(uid);
        return  user;
    }
}
