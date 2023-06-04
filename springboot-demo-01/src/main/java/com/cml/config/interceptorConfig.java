package com.cml.config;

import com.cml.interceptor.interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class interceptorConfig implements WebMvcConfigurer {
    @Autowired
    private interceptor interceptor;
    @Override
    //重写注册方法注册拦截器
    public void addInterceptors(InterceptorRegistry registry) {
//        注册拦截器,拦截方式
        registry.addInterceptor(interceptor).addPathPatterns("/**");
    }

}
