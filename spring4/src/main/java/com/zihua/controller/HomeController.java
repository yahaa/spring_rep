package com.zihua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by zihua on 16-12-26.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
