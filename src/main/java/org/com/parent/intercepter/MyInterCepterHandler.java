package org.com.parent.intercepter;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//定义一个拦截器，然后注册到SpringBoot中统一管理
public class MyInterCepterHandler extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入自定义的拦截器了。。。");
        return true;
    }
}
