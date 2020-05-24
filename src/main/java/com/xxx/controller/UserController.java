package com.xxx.controller;

import com.xxx.service.UserService;
import com.xxx.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public ModelAndView queryUserById(int id){
        User user = userService.queryUserById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
