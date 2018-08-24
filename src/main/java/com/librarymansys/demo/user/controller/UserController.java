package com.librarymansys.demo.user.controller;

import com.librarymansys.demo.user.domain.User;
import com.librarymansys.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login() {
        return "user/login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String  login( User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        String role=userService.getRole(username,password);
        if("admin".equals(role)){
            System.out.println("admin");
            return "redirect:book/admin_index.html";
        }else if("student".equals(role)){
            System.out.println("login");
           return  "redirect:user/login";
        }else {
            return "redirect:user/register";
        }

    }


}
