package com.jy.user.controller;

import com.jy.user.service.UserServiceImpl;
import com.jy.user.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @RequestMapping(value="/login.do", method = RequestMethod.GET)
    public String login(Model model) {

        model.addAttribute("list", service.selUser());
        return "user/login";
    }

    @RequestMapping(value="/join.do", method = RequestMethod.GET)
    public String join() {

        return "user/join";
    }

    @RequestMapping(value="/join.do", method = RequestMethod.POST)
    public String join(UserVO vo, HttpServletRequest request) {


        return "user/login";
    }
}
