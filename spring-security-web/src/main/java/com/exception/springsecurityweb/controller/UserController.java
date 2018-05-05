package com.exception.springsecurityweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jiangbing(江冰)
 * @date 2018/5/4
 * @time 下午3:05
 * @discription
 **/
@Controller
public class UserController {

    @GetMapping("/user")
    @ResponseBody
    public String getUser() {
        return "user";
    }

    @GetMapping("/user/login")
    public String login() {
        return "user-login.html";
    }
}
