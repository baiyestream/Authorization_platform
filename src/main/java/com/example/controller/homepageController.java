package com.example.controller;

import com.example.service.organizationService;
import com.example.service.productService;
import com.example.service.userAuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/homepage")
public class homepageController {

    @Autowired
    private organizationService organizationService;

    @Autowired
    private productService productService;

    @Autowired
    private userAuthorizationService userAuthorizationService;


    /**
     * 机构数量
     * @return
     */
    @PostMapping("/organCount")
    public Integer organCount(){
        return organizationService.count();
    }

    /**
     * 产品数量
     * @return
     */
    @PostMapping("/productCount")
    public Integer productCount(){
        return productService.count();
    }

    /**
     * 用户数量
     * @return
     */
    @PostMapping("/userCount")
    public Integer userCount(){
        return userAuthorizationService.count();
    }


}
