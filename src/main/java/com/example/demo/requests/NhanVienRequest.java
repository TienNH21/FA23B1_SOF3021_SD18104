package com.example.demo.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NhanVienRequest {
    private String ma;
    private String ho;
    private String tenDem;
    private String ten;
    private Integer gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String sdt;

}
