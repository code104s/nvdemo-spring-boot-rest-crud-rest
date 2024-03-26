package com.offlink112.nvdemo.dao;

import com.offlink112.nvdemo.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;


// @RepositoryRestResource(path = "members")

public interface NhanVienRespository extends JpaRepository<NhanVien, Integer> {


}
