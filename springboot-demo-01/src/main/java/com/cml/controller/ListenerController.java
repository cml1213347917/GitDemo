package com.cml.controller;

import com.cml.listener.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListenerController {
@Autowired
    private ApplicationEventPublisher publisher;
    @RequestMapping("/event")
    public String listener(){
        publisher.publishEvent(new CustomEvent(this));
        return  "Success";
    }

    @RequestMapping("/testerror")
    public String error() throws Exception{
       throw new Exception("测试全局异常");
    }

}
