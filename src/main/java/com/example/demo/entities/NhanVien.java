package com.example.demo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name="NhanVien")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class NhanVien {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name="Ho")
    private String ho;

    @Column(name="TenDem")
    private String tenDem;

    @Column(name="Ten")
    private String ten;

    @Column(name="GioiTinh")
    private String gioiTinh;

    @Column(name="NgaySinh")
    private String ngaySinh;

    @Column(name="DiaChi")
    private String diaChi;

    @Column(name="Sdt")
    private String sdt;

    @Column(name="Ma")
    private String ma;

    @Column(name="MatKhau")
    private String matKhau;
}
