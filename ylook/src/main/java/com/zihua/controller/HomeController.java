package com.zihua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zihua on 16-12-25.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    @RequestMapping(value = "/")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping(value = "/register")
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/home")
    public String home() {
        return "home";
    }

}
