//package com.cml.Exception;
//
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// * 全局异常类
// */
//@ControllerAdvice//声明全局异常  只要处理Controller有异常就可以获取
//public class MyExceptionHandler {
//    @ExceptionHandler(Exception.class)//要处理的异常
//    public ModelAndView handler(Exception e){
//        ModelAndView view = new ModelAndView();
//        view.setViewName("/error");
//        return  view;
//    }
//}
