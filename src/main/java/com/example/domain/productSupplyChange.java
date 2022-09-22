package com.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@TableName("tbl_product_supply_change")
@Data
public class productSupplyChange {

    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    @TableField(value = "authorization_record_id")
    private Integer authorizationRecordId;
    @TableField(value = "organization_id")
    private Integer organizationId;
    @TableField(value = "organization_name")
    private String organizationName;
    @TableField(value = "product_id")
    private Integer productId;
    @TableField(value = "product_name")
    private String productName;
    @TableField(value = "batch_number")
    private String batchNumber;
    @TableField(value = "product_authorization_before")
    private Integer productAuthorizationBefore;
    @TableField(value = "product_authorization_after")
    private Integer productAuthorizationAfter;
    @TableField(value = "change_reason")
    private String changeReason;
    @TableField(value = "change_time")
    private Timestamp changeTime;
    @TableField(value = "update_id")
    private Integer updateId;
    @TableField(value = "review_id")
    private Integer reviewId;
    @TableField(value = "effective_time")
    private Timestamp effectiveTime;

}
