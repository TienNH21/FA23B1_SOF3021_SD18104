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
        NhanVien nv = this.nvRepo.findByMa(maNV);
        this.nvRepo.delete(nv);
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
        NhanVien nv = new NhanVien();
        nv.setMa(req.getMa());
        nv.setHo(req.getHo());
        nv.setTenDem(req.getTenDem());
        nv.setTen(req.getTen());
        nv.setGioiTinh(req.getGioiTinh());
        nv.setNgaySinh(req.getNgaySinh());
        nv.setDiaChi(req.getDiaChi());
        nv.setSdt(req.getSdt());
        nv.setMatKhau(req.getMatKhau());
        this.nvRepo.save(nv);
        return "redirect:/nhan-vien/index";
    }

    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma, Model m)
    {
        NhanVien nv = this.nvRepo.findByMa(ma);
        m.addAttribute("nv", nv);
        return "nhan_vien/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma, NhanVienRequest req)
    {
        NhanVien oldValue = this.nvRepo.findByMa(ma);
        NhanVien nv = new NhanVien();
        nv.setId(oldValue.getId());
        nv.setMa(req.getMa());
        nv.setHo(req.getHo());
        nv.setTenDem(req.getTenDem());
        nv.setTen(req.getTen());
        nv.setGioiTinh(req.getGioiTinh());
        nv.setNgaySinh(req.getNgaySinh());
        nv.setDiaChi(req.getDiaChi());
        nv.setSdt(req.getSdt());
        nv.setMatKhau(req.getMatKhau());
        this.nvRepo.save(nv);

        return "redirect:/nhan-vien/index";
    }

//    @ModelAttribute("test1")
//    public int[] test()
//    {
//        int[] a = {1, 2, 3, 4};
//        return a;
//    }
}
