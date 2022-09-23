package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.R;
import com.example.domain.productSupply;
import com.example.service.productSupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productSupply")
public class productSupplyController {

    /**
     * 与 authorizationBatchController 为同一张表
     * 皆使用productSupplyService字段
     */
    @Autowired
    private productSupplyService productSupplyService;

    /**
     * 产品供应管理页面列表
     * @param size
     * @param pageSize
     * @return
     */
    public R<Page> list(int size,int pageSize){

        Page pageInfo = new Page(size,pageSize);

        LambdaQueryWrapper<productSupply> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.orderByAsc(productSupply::getId);
        productSupplyService.page(pageInfo,queryWrapper);

        return R.success(pageInfo);

    }
}
