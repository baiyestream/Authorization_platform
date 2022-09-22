package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.R;
import com.example.domain.product;
import com.example.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class productController {

    @Autowired
    private productService productService;

    /**
     * 产品列表
     * @param page
     * @param pageSize
     * @return
     */
    @PostMapping("/list")
    public R<Page> search(int page, int pageSize){

        Page pageinfo = new Page(page,pageSize);

        LambdaQueryWrapper<product> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByAsc(product::getId);
        productService.page(pageinfo,queryWrapper);

        return R.success(pageinfo);


    }
}
