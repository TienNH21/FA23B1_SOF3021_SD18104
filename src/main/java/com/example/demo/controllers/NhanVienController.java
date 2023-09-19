package com.example.demo.controllers;

import com.example.demo.requests.NhanVienRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("nhan-vien")
public class NhanVienController {
    private ArrayList<NhanVienRequest> ds;

    public NhanVienController()
    {
        this.ds = new ArrayList<>();
        ds.add(new NhanVienRequest("PH1", "Ng", "Van", "A", 1, "12/12/2000", "HN", "0123123123"));
        ds.add(new NhanVienRequest("PH2", "Ng", "Thi", "B", 0, "12/12/2000", "HN", "0123123123"));
    }

    @GetMapping("index")
    public String index(Model model)
    {
        model.addAttribute("data", this.ds);
        return "nhan_vien/index";
    }

    @GetMapping("create")
    public String create()
    {
        return "nhan_vien/create";
    }

    @PostMapping("store")
    public String store(@ModelAttribute("nv") NhanVienRequest req) {
        System.out.println(req.getMa());
        System.out.println(req.getHo());
        System.out.println(req.getTenDem());
        System.out.println(req.getTen());

//        model.addAttribute("nv", req);

        return "nhan_vien/create";
    }
}
