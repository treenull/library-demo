package com.wyj.library.controller;

import com.wyj.library.model.User;
import com.wyj.library.model.UserExample;
import com.wyj.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/allUser")
    public void getAllUser(UserExample example){
        List<User> all = userService.getAllUser(example);
        System.out.println(all);
    }

    @GetMapping("/hello")
        public String hello(){
        return "hello";
        }
}
