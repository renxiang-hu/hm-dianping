package com.hmdp.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //在执行controller方法(handler)之前进行执行
        /**
         * 1.需要判断请求接口路径是否为handlerMethod(controller方法)
         * 2.判断token是否为空，如果为空 未登录
         * 3.如果token不为空，登录验证
         * 4.如果认证成功 放行即可
         */
        //这里添加检验逻辑
        return true;
    }
}
