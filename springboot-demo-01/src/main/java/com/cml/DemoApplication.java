package com.cml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.cml.mapper")//扫描mapper对应的包
@ServletComponentScan("com.cml.Filter")//扫描对应的filter包
public class DemoApplication {
    public static void main(String[] args) {
        //使用SpringApplication类的静态方法，启动springboot项目
        //方法参数  程序入口类，main函数的参数
        SpringApplication.run(DemoApplication.class,args);
    }
}
