package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.R;
import com.example.domain.BusinessLicense;
import com.example.domain.Organization;
import com.example.domain.Product;
import com.example.service.businessLicenseService;
import com.example.service.organizationService;
import com.example.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/businessLicense")
public class businessLicenseController {

    @Autowired
    private businessLicenseService businessLicenseService;

    @Autowired
    private organizationService organizationService;

    @Autowired
    private productService productService;


    /**
     * 产品经营许可管理页面列表
     * @param page 分页
     * @param pageSize 分页数
     * @return 分页数据
     */
    @PostMapping("/page")
    public R<Page> list(int page,int pageSize){

        Page pageInfo = new Page(page,pageSize);

        LambdaQueryWrapper<BusinessLicense> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.orderByAsc(BusinessLicense::getId);
        businessLicenseService.page(pageInfo,queryWrapper);

        return R.success(pageInfo);
    }

    /**
     * 产品经营许可管理页面，新增产品内的机构名称
     * @return 机构名称
     */
    @PostMapping("/list01")
    public R<List> list01(){
        LambdaQueryWrapper<Organization> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.select(Organization::getOrganizationName);
        List<Organization> list = organizationService.list(queryWrapper);
        return R.success(list);
    }

    /**
     * 产品经营许可管理页面，新增产品内的产品名称
     * @return 产品名称
     */
    @PostMapping("/list02")
    public R<List> list02(){
        LambdaQueryWrapper<Product> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.select(Product::getProductName);
        List<Product> list = productService.list(queryWrapper);
        return R.success(list);
    }

    /**
     * 产品经营许可管理页面：新增产品许可
     * @return 新增产品经营许可
     */
    @PostMapping("/add")
    public R<String> save(HttpServletRequest request, @RequestBody BusinessLicense businessLicense ){

        Integer operator = (Integer) request.getSession().getAttribute("operator");
        // 创建人
        businessLicense.setCreateId(operator);
        // 登记时间
        businessLicense.setCreateTime(Timestamp.valueOf(LocalDateTime.now()));

        businessLicenseService.save(businessLicense);

        return R.success("新增机构成功");
    }


}
















