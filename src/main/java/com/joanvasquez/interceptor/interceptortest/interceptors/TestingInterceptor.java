package com.joanvasquez.interceptor.interceptortest.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("timeInterceptor")
public class TestingInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
            HandlerMethod controller = (HandlerMethod) handler;
        System.out.println("Pre Interceptor");
        System.out.println(request.getParameter("num"));
        System.out.println(controller.getMethod().getName());
        request.setAttribute("meeting", "Hello World");
        //IF AUTH NOT FULFILLED, RETURN FALSE
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        System.out.println("Post Interceptor");
    }

}
