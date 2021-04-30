package com.fc.controller;

import com.fc.bean.User;
import com.fc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping("login")
    public void login(String login, String password) {
        System.out.println("登录");
    }

    @RequestMapping("logout")
    public void logout() {
        System.out.println("退出登录");
    }
}
