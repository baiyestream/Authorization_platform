package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.R;
import com.example.domain.businessLicense;
import com.example.service.businessLicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/businessLicense")
public class businessLicenseController {

    @Autowired
    private businessLicenseService businessLicenseService;

    /**
     * 产品经营许可管理页面列表
     * @param page
     * @param pageSize
     * @return
     */
    public R<Page> list(int page,int pageSize){

        Page pageInfo = new Page(page,pageSize);

        LambdaQueryWrapper<businessLicense> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.orderByAsc(businessLicense::getId);
        businessLicenseService.page(pageInfo,queryWrapper);

        return R.success(pageInfo);
    }
}
