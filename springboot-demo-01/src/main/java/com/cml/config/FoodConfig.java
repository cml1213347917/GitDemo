package com.cml.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration//声明当前是配置类  在spring中可以代替xml文件
@ConfigurationProperties(prefix = "food")//声明当前是配置文件类 并且声明前缀
@PropertySource("classpath:application.yml")//声明文件地址
public class FoodConfig {
    private String hanbao;
    private String shutiao;

    public String getHanbao() {
        return hanbao;
    }

    public void setHanbao(String hanbao) {
        this.hanbao = hanbao;
    }

    public String getShutiao() {
        return shutiao;
    }

    public void setShutiao(String shutiao) {
        this.shutiao = shutiao;
    }
}
