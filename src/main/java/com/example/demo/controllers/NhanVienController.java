package com.example.demo.controllers;

import com.example.demo.entities.NhanVien;
import com.example.demo.repositories.NhanVienRepository;
import com.example.demo.requests.NhanVienRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("nhan-vien")
public class NhanVienController {
    private List<NhanVien> ds;

    @Autowired
    private NhanVienRepository nvRepo;

    public NhanVienController()
    {
        this.ds = new ArrayList<>();
    }

    @GetMapping("index")
    public String index(Model model)
    {
        this.ds = this.nvRepo.findAll();
        model.addAttribute("data", this.ds);
        return "nhan_vien/index";
    }

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maNV)
    {
//        for (int i = 0; i < this.ds.size(); i++) {
//            NhanVienRequest nv = this.ds.get(i);
//            if (nv.getMa().equals(maNV)) {
//                this.ds.remove(i);
//                break;
//            }
//        }
        return "redirect:/nhan-vien/index";
    }

    @GetMapping("create")
    public String create(@ModelAttribute("nv") NhanVienRequest req)
    {
        return "nhan_vien/create";
    }

    @PostMapping("store")
    public String store(
        @Valid @ModelAttribute("nv") NhanVienRequest req,
        BindingResult result
    ) {
        System.out.println(req.getMa());
        System.out.println(req.getHo());
        System.out.println(req.getTenDem());
        System.out.println(req.getTen());

        return "redirect:/nhan-vien/index";
    }

    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma, Model m)
    {
//        for (int i = 0; i < this.ds.size(); i++) {
//            NhanVienRequest nv = this.ds.get(i);
//            if (nv.getMa().equals(ma)) {
//                m.addAttribute("nv", nv);
//                break;
//            }
//        }

        return "nhan_vien/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma, NhanVienRequest req)
    {
//        for (int i = 0; i < this.ds.size(); i++) {
//            NhanVienRequest nv = this.ds.get(i);
//            if (nv.getMa().equals(ma)) {
//                this.ds.set(i, req);
//                break;
//            }
//        }

        return "redirect:/nhan_vien/index";
    }

//    @ModelAttribute("test1")
//    public int[] test()
//    {
//        int[] a = {1, 2, 3, 4};
//        return a;
//    }
}
