package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.common.R;
import com.example.domain.Operator;
import com.example.service.operatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/operator")
public class operatorController {

    @Autowired
    private operatorService operatorService;

    /**
     * 操作员登录页面
     */
    @PostMapping("/login")
    public R<Operator> login(HttpServletRequest request, @RequestBody Operator operator){

        String loginPassword = operator.getLoginPassword();

        LambdaQueryWrapper<Operator> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Operator::getLoginAccount,operator.getLoginAccount());
        Operator operator1 = operatorService.getOne(queryWrapper);

        if(operator1 == null){
            return R.error("登录失败");
        }
        if(!operator1.getLoginPassword().equals(loginPassword)){
            return R.error("登录失败");
        }

        request.getSession().setAttribute("operator",operator1.getLoginAccount());
        return R.success(operator1);
    }

    /**
     * 操作员退出接口
     */
    @PostMapping("/logout")
    public R<String> logout(HttpServletRequest request){
        request.getSession().removeAttribute("operator");
        return R.success("退出成功");
    }


}
