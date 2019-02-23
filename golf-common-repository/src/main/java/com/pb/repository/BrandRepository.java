package com.pb.repository;


import com.pb.pojo.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BrandRepository {
    List<Brand> findByPage();
    //List<Brand> findByVague();
}