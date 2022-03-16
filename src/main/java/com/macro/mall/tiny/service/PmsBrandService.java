package com.macro.mall.tiny.service;


import com.macro.mall.tiny.mbg.model.PmsBrand;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(long id, PmsBrand brand);

    int deleteBrand(long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(long id);

}
