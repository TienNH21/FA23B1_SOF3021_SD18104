package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NhanVienController {
    @GetMapping("/nhan-vien/create")
    public String create()
    {
        return "nhan_vien/create";
    }

    @PostMapping("/nhan-vien/store")
    public String store(
        @RequestParam("ma") String ma,
        @RequestParam("ho") String ho,
        @RequestParam("tenDem") String tenDem,
        @RequestParam("ten") String ten
    ) {
        System.out.println(ma);
        System.out.println(ho);
        System.out.println(tenDem);
        System.out.println(ten);
        return "nhan_vien/create";
    }
}
