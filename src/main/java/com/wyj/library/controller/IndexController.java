package com.wyj.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 设置默认访问首页
 */

@Controller
public class IndexController {

    @GetMapping({"/",""})
    public String index(){
        return "loginForm";
    }

    @GetMapping("/main")
    public String toMain(){
        return "main";
    }

    @GetMapping("/welcome")
    public String toWelcome(){
        return "welcome";
    }

}
