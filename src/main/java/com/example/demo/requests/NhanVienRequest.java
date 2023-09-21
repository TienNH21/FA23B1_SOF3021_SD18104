package com.example.demo.requests;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
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
    @NotBlank(message = "Không được để trống")
    private String ma;

    @NotBlank
    private String ho;

    private String tenDem;

    @NotBlank
    private String ten;

    private Integer gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String sdt;

}
