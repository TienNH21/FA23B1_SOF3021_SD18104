package com.example.demo.controllers;

import com.example.demo.requests.NhanVienRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @Autowired
    @Qualifier("HoangPH")
    private NhanVienRequest nvReq;

    @GetMapping("hello-page")
    public String hello()
    {
        System.out.println(this.nvReq.getMa());
        System.out.println(this.nvReq.getHo());
        System.out.println(this.nvReq.getTenDem());
        System.out.println(this.nvReq.getTen());
        return "hello";
    }
}
