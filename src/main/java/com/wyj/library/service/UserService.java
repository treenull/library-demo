package com.wyj.library.service;

import com.wyj.library.mapper.UserMapper;
import com.wyj.library.model.User;
import com.wyj.library.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> checkUser(String loginname, String password){
        return userMapper.checkUser(loginname,password);

    }

    public List<User> getAllUser(UserExample example){
        return userMapper.selectByExample(example);
    }
}
