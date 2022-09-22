package com.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tbl_operator")
public class operator {

    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    @TableField(value = "login_account")
    private String loginAccount;
    @TableField(value = "login_password")
    private String loginPassword;
    @TableField(value = "number")
    private String name;
    @TableField(value = "department")
    private String department;
    @TableField(value = "level_id")
    private String levelId;
    @TableField(value = "refund_authority")
    private Integer refundAuthority;
    @TableField(value = "state")
    private String state;
    @TableField(value = "first_login_flag")
    private Integer firstLoginFlag;
    @TableField(value = "create_id")
    private Integer createId;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "update_id")
    private Integer updateId;
    @TableField(value = "update_time")
    private Date updateTime;
    @TableField(value = "review_id")
    private Integer reviewId;
    @TableField(value = "review_time")
    private Date reviewTime;



}
