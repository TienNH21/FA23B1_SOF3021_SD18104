package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class LoginController {
    @GetMapping("login")
    public String getLoginForm()
    {
        return "login";
    }

    @PostMapping("login")
    public String login(
        @RequestParam("username") String user,
        @RequestParam("password") String pwd
    ) {
        System.out.println(user);
        System.out.println(pwd);
        return "login";
    }
}
