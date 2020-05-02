package com.wyj.library.controller;

import com.wyj.library.model.User;
import com.wyj.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/login")
    public ModelAndView login(@RequestParam("loginname") String loginname,
                              @RequestParam("password") String password,
                              HttpSession session,
                              ModelAndView mav){
        // 调用业务逻辑组件判断用户是否可以登录
        List<User> user = userService.checkUser(loginname, password);
        System.out.println(user);
        if(user.size()>0){
            // 将用户保存到HttpSession当中
            System.out.println("HttpSession");
            session.setAttribute("loginUser", loginname);
            // 客户端跳转到main页面
            mav.setViewName("redirect:/index.html");
        }else{
            // 设置登录失败提示信息
            System.out.println("设置登录失败提示信息");
            mav.addObject("message", "登录名或密码错误!请重新输入!");
            // 服务器内部跳转到登录页面
            mav.setViewName("loginForm");
        }
        return mav;
    }

//    @GetMapping("/hello")
//        public String hello(){
//        return "hello";
//        }

//    @RequestMapping("/test")
//    public String test(){
//        return "welcome";
//    }
}
