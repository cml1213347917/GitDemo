package com.cml.listener;

import org.springframework.context.ApplicationListener;

/**
 * 事件监听器
 */
public class CustomListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessge("CustomListener监听到了");

    }
}
