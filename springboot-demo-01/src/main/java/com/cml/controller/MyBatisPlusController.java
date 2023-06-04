package com.cml.controller;

import com.cml.domain.User;
import com.cml.servies.MyBatisPlusServiesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyBatisPlusController {
    @Autowired
    private MyBatisPlusServiesImpl servies;

    @RequestMapping("plus")
    @ResponseBody
    public List<User> selectUser(){
        List<User> list = servies.list(null);
        return list;
    }
}
