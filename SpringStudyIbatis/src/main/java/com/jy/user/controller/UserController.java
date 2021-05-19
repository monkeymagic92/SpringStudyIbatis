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

    // 로그인
    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public String login(Model model, UserVO vo) {
        vo.setI_user("2");
        model.addAttribute("list", service.selUser(vo));
        return "user/login";
    }

    // 회원가입
    @RequestMapping(value = "/join.do", method = RequestMethod.GET)
    public String join() {

        return "user/join";
    }

    // 회원가입 post
    @RequestMapping(value = "/join.do", method = RequestMethod.POST)
    public String join(UserVO vo, HttpServletRequest request) {
        int result = service.joinUser(vo);
        System.out.println("result : " + result);

        if (result == 1) {
            return "redirect:/user/login.do";
        } else {
            return "redirect:/user/join.do";
        }
    }

    // 유저 전체목록
    @RequestMapping(value = "/userList.do", method = RequestMethod.GET)
    public String userList(UserVO vo, Model model) {

        model.addAttribute("list", service.userList());
        return "user/userList";
    }
}
