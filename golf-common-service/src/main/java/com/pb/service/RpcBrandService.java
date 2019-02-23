package com.pb.service;

import com.pb.pojo.Brand;

import java.util.List;

public interface RpcBrandService {
    List<Brand> findByPage();

    //List<Brand> findByVague();
}
