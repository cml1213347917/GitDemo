package com.cml.listener;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }
//    事件操作
    public void printMessge(String msg){
        System.out.println("自定义事件,监听器到了"+msg);
    }
}
