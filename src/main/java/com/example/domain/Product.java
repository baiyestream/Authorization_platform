package com.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("tbl_product")
public class Product {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    @TableField(value = "product_name")
    private String productName;
    @TableField(value = "product_overview")
    private String productOverview;
    @TableField(value = "access_address")
    private String accessAddress;
    @TableField(value = "download_address")
    private String downloadAddress;
    @TableField(value = "version_number")
    private String versionNumber;
    @TableField(value = "state")
    private Integer state;
    @TableField(value = "create_id")
    private Integer createId;
    @TableField(value = "create_time")
    private Timestamp createTime;
    @TableField(value = "review_id")
    private Integer reviewId;
    @TableField(value = "review_time")
    private Timestamp reviewTime;
}
