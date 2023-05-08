package com.cml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        //使用SpringApplication类的静态方法，启动springboot项目
        //方法参数  程序入口类，main函数的参数
        SpringApplication.run(DemoApplication.class,args);
    }
}
