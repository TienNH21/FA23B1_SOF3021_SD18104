package com.example.demo.repositories;

import com.example.demo.entities.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NhanVienRepository
    extends JpaRepository<NhanVien, UUID> {

    @Query("SELECT obj FROM NhanVien obj WHERE obj.ma = ?1")
    public NhanVien findByMa(String ma);
}
