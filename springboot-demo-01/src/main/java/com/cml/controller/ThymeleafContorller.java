package com.cml.controller;

import com.cml.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafContorller {

    @RequestMapping("/tm")
    public String tlf(Model model){
        System.out.println("tlf方法");
        User user=new User();
        user.setUid(1);
        user.setUsername("和审评");
        user.setPassword("123456");
        model.addAttribute("user",user);
        return "thymeleaf/thymeleaf";
    }
}
