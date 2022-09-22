package com.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Timestamp;

@TableName("tbl_user_authorization_history")
public class userAuthorizationHistory {
    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    @TableField(value = "user_authorization_id")
    private Integer userAuthorizationId;
    @TableField(value = "username")
    private String username;
    @TableField(value = "product_name")
    private String productName;
    @TableField(value = "activate_code")
    private String activateCode;
    @TableField(value = "verification_time")
    private Timestamp verificationTime;
    @TableField(value = "verification_results")
    private String  verificationResults;
}