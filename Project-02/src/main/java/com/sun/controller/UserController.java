package com.sun.controller;

import com.sun.bean.User;
import com.sun.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("/loginPage")           //返回登录页面
    public String loginPage(){
        return "/user/login.jsp";
    }

    @RequestMapping("/homePage")      //返回主页面
    public  String homePage(){
         return "/WEB-INF/view/homePage.jsp";
    }
    @RequestMapping("/registerPage")  //注册页面
    public String register(){
        return "/user/register.jsp";
    }
    @RequestMapping("/findPasswordPage")  //注册页面
    public String findPassword(){
        return "/user/findPassword.jsp";
    }



    @RequestMapping("/login")
    @ResponseBody
    public String login(String username){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("username",username);
        List<User> users = userService.queryForUser(map);

        if(users.isEmpty()){
            return "用户名可用";
        }else{
            return "用户名已存在";
        }

    }
    @RequestMapping("/loginForJson")
    @ResponseBody
    public String loginForJson(String username, String password, HttpSession session){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("username",username);
        map.put("password",password);
        List<User> users = userService.queryForUser(map);

        if(users.isEmpty()){
            return "用户名或密码错误";
        }else{
            session.setAttribute("userLoginInfo",username);
            return "登录成功";
        }
    }

   @RequestMapping("/register")
   public String register(String username,String password,String id_card){
           Map<String,Object> map=new HashMap<String, Object>();
           map.put("username",username);
           map.put("password",password);
           map.put("id_card",id_card);
           userService.addUser(map);
           return "redirect:/loginPage";
   }

   @RequestMapping("/findPassword")
   @ResponseBody
   public  String findPassword(String username,String password,String id_card){
       Map<String,Object> map=new HashMap<String, Object>();
       map.put("username",username);
       map.put("password",password);
       map.put("id_card",id_card);
       userService.updateUser(map);
       return "redirect:/loginPage";
   }


}
