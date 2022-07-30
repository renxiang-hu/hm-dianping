package com.hmdp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/WelcomeController")
public class WelcomeController {
    @RequestMapping("/welcome")
    public String welcome(){
        System.out.println("经过拦截器的WelcomeController执行完毕");
        return "welcome";
    }
}
