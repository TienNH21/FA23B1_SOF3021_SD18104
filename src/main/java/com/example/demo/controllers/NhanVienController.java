package com.example.demo.controllers;

import com.example.demo.requests.NhanVienRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("nhan-vien")
public class NhanVienController {
    @GetMapping("create")
    public String create()
    {
        return "nhan_vien/create";
    }

    @PostMapping("store")
    public String store(NhanVienRequest req) {
        System.out.println(req.getMa());
        System.out.println(req.getHo());
        System.out.println(req.getTenDem());
        System.out.println(req.getTen());
        return "nhan_vien/create";
    }
}
