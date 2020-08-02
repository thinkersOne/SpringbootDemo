package org.com.parent.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
public class HelloControllerAdvice {
    @ExceptionHandler(Exception.class)
    //自定义错误方法   HandlerMethod表示可以定位到错误的类及方法
    public void handlerError(Exception ex, HandlerMethod handlerMethod, HttpServletResponse response,
                             HttpServletRequest request) throws IOException {
        System.out.println("统一异常处理");
        System.out.println(ex.getMessage());
        System.out.println("异常类为:"+handlerMethod.getBean().getClass()+
                "异常方法为:"+handlerMethod.getMethod().getName());
        System.out.println(request.getContextPath()+","+request.getServletPath());
    }
}
