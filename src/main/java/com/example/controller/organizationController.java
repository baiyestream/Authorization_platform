package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.R;
import com.example.domain.organization;
import com.example.service.organizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organizationController")
public class organizationController {

    @Autowired
    private organizationService organizationService;

    @PostMapping("/page")
    public R<Page> search(int page,int pageSize){

        Page pageInfo = new Page(page,pageSize);

        LambdaQueryWrapper<organization> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByAsc(organization::getCreateId);
        organizationService.page(pageInfo,queryWrapper);

        return R.success(pageInfo);
    }
}
