package com.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
@TableName("tbl_business_license")
public class businessLicense {

    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    @TableField(value = "organization_id")
    private Integer organizationId;
    @TableField(value = "organization_name")
    private String organizationName;
    @TableField(value = "product_id")
    private Integer productId;
    @TableField(value = "product_name")
    private String productName;
    @TableField(value = "business_license_start")
    private Date businessLicenseStart;
    @TableField(value = "business_license_end")
    private Date businessLicenseEnd;
    @TableField(value = "state")
    private Integer state;
    @TableField(value = "remarks")
    private String remarks;
    @TableField(value = "create_id")
    private Integer createId;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "update_id")
    private Integer updateId;
    @TableField(value = "update_time")
    private Timestamp updateTime;
    @TableField(value = "review_id")
    private Integer reviewId;
    @TableField(value = "review_time")
    private Timestamp reviewTime;
}
