package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.R;
import com.example.domain.Organization;
import com.example.service.organizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/organization")
public class organizationController {

    @Autowired
    private organizationService organizationService;

    /**
     * 机构管理列表
     * @param page
     * @param pageSize
     * @return
     */
    @PostMapping("/page")
    public R<Page> list(Integer page,Integer pageSize){

        Page pageInfo = new Page(page,pageSize);

        LambdaQueryWrapper<Organization> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByAsc(Organization::getId);
        organizationService.page(pageInfo,queryWrapper);

        return R.success(pageInfo);
    }

    /**
     * 机构管理：新增机构
     * @param request
     * @param organization
     * @return
     */
    @PostMapping("/add")
    public R<String> save(HttpServletRequest request, @RequestBody Organization organization){

        Integer operator = (Integer) request.getSession().getAttribute("operator");

        organization.setCreateId(operator);
        // 创建时间
        organization.setCreateTime(Timestamp.valueOf(LocalDateTime.now()));
        // 建档时间
        organization.setReviewTime(Timestamp.valueOf(LocalDateTime.now()));

        organizationService.save(organization);

        return R.success("增加机构成功");
    }
}
