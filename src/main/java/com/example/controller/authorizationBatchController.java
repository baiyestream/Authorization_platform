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
@RequestMapping("/authorizationBatch")
public class authorizationBatchController {

    @Autowired
    private productSupplyService productSupplyService;

    /**
     * 授权批次管理页面列表
     * @param page
     * @param pageSize
     * @return
     */
    public R<Page> list(int page,int pageSize){

        Page pageinfo = new Page(page,pageSize);

        LambdaQueryWrapper<productSupply> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByAsc(productSupply::getId);
        productSupplyService.page(pageinfo,queryWrapper);

        return R.success(pageinfo);
    }

}
