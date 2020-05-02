package com.wyj.library;

import com.wyj.library.model.User;
import com.wyj.library.model.UserExample;
import com.wyj.library.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo {

    @Resource
    UserService userService;
    @Resource
    UserExample example;

    @Test
    public void run(){
        String loginname = "admin";
        String password = "123456";
        List<User> user =userService.checkUser(loginname, password);
        if (user!=null){
            System.out.println(user);
        }else{
            System.out.println("fail");
        }
    }

    @Test
    public void run2(){
        List<User> allUser = userService.getAllUser(example);
        System.out.println(allUser);
    }
}
