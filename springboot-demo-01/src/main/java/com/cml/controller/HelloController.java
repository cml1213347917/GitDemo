//package com.cml.controller;
//
//import com.cml.config.FoodConfig;
//import com.cml.domain.Food;
//import com.cml.domain.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController//@ResponseBody @Controller 合体  说明这个类只返回json数据
//public class HelloController {
//    @Value("${user.id}")
//    private Integer id;
//    @Value("${user.username}")
//    private String name;
//    @Value("${user.password}")
//    private String password;
//    @RequestMapping("test")
//    public User hello(){
//        User user=new User();
//        user.setId(id);
//        user.setName(name);
//        user.setPassword(password);
//        return user;
//    }
//
//    @Autowired
//    private FoodConfig config;
//    @RequestMapping("food")
//    public Food food(){
//        Food food = new Food();
//        food.setHanbao(config.getHanbao());
//        food.setShutiao(config.getShutiao());
//        return  food;
//    }
//}
