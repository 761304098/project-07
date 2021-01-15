package com.sun.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();

        if(request.getRequestURI().contains("login")){
            return true;
        }

        if(request.getRequestURI().contains("registerPage")){
            return true;
        }
        if(session.getAttribute("userLoginInfo")!=null){
            return true;
        }

        request.getRequestDispatcher("/user/login.jsp").forward(request,response);
        return false;
    }
}
