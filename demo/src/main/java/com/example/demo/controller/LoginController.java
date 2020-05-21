package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author changwei.zheng
 * @date 2020/5/21 10:59
 * @describe
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

}
