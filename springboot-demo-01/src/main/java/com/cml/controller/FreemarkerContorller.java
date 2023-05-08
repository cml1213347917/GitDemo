package com.cml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class FreemarkerContorller {
    @RequestMapping("/ftl")
    public String ftl(Model model){
        model.addAttribute("now",new Date().toString());
        return  "freemarker/index";
    }
}
