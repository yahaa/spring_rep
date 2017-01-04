package com.zihua.controller;

import com.sun.deploy.net.HttpResponse;
import com.zihua.entity.User;
import com.zihua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by zihua on 16-12-29.
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    public String addUser(@Validated User user, Model model) {

        userService.addUser(user);
        return "redirect:/login";
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public String check(String username, String password, Model model,
                        HttpServletRequest request, HttpServletResponse response) {
        boolean ok = userService.checkLogin(username, password);
        if (ok) {

            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(300);
            session.setAttribute("www.zihua.com", userService.getUserByName(username));
            return "redirect:/home";
        } else {

            return "redirect:/login";
        }

    }

    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        session.removeAttribute("www.zihua.com");
        return "redirect:/";
    }

    @RequestMapping(value = "/personal_center")
    public String personCenter(){
        return "personal_center";
    }
}
