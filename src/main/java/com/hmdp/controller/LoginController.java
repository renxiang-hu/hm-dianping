package com.hmdp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("LoginController")
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        System.out.println("LoginController已执行");
        return "login";
    }
}
