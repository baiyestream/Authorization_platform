package com.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tbl_user_authorization")
public class userAuthorization {

    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    @TableField(value = "product_supply_id")
    private Integer productSupplyId;
    @TableField(value = "username")
    private String username;
    @TableField(value = "IMEI")
    private String IMEI;
    @TableField(value = "product_name")
    private String productName;
    @TableField(value = "organization_name")
    private String organizationName;
    @TableField(value = "batch_number")
    private String batchNumber;
    @TableField(value = "phone_number")
    private String phoneNumber;
    @TableField(value = "authorization_time")
    private Date authorizationTime;
    @TableField(value = "activate_code")
    private String activateCode;
}
