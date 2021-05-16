package com.jy.user.controller;

import com.jy.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @RequestMapping("/login.do")
    public String login(Model model) {

        model.addAttribute("list", service.selUser());
        return "user/login";
    }
}
