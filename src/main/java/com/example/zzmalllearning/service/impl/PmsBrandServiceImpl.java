package com.example.zzmalllearning.service.impl;

import com.example.zzmalllearning.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;

public class PmsBrandServiceImpl implements PmsBrandService {
    @Autowired
    private PmsBrandMapper brandMapper;


    @Override
    public List<PmsBrand> listAllBrand() {
        return null;
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return 0;
    }

    @Override
    public int updateBrand(Long id) {
        return 0;
    }

    @Override
    public int deleteBrand(Long id) {
        return 0;
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return null;
    }
}
