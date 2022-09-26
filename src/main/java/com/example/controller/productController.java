package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.R;
import com.example.domain.Product;
import com.example.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/product")
public class productController {

    @Autowired
    private productService productService;

    /**
     * 产品管理列表
     * @param page
     * @param pageSize
     * @return
     */
    @PostMapping("/list")
    public R<Page> list(int page, int pageSize){

        Page pageinfo = new Page(page,pageSize);

        LambdaQueryWrapper<Product> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByAsc(Product::getId);
        productService.page(pageinfo,queryWrapper);

        return R.success(pageinfo);
    }

    public R<String> save(HttpServletRequest request, @RequestBody Product product){

        Integer operator = (Integer) request.getSession().getAttribute("operator");
        // 创建人
        product.setCreateId(operator);
        // 创建时间
        product.setCreateTime(Timestamp.valueOf(LocalDateTime.now()));

        productService.save(product);

        return R.success("新增产品成功");
    }


}
