package com.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("tbl_product_supply")
public class productSupply {

    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    @TableField(value = "business_license_id")
    private Integer businessLicenseId;
    @TableField(value = "supply_time")
    private Timestamp supplyTime;
    @TableField(value = "supply_quantity")
    private Integer supplQuantity;
    @TableField(value = "batch_number")
    private Integer batchNumber;
    @TableField(value = "product_authorization")
    private Integer productAuthorization;
    @TableField(value = "supply_record")
    private Integer supplyRecord;
    @TableField(value = "invoice_number")
    private String invoiceNumber;
    @TableField(value = "supply_remarks")
    private String supplyRemarks;
    @TableField(value = "create_id")
    private Integer createId;
    @TableField(value = "create_time")
    private Timestamp createTime;
    @TableField(value = "update_id")
    private Integer updateId;
    @TableField(value = "update_time")
    private Timestamp updateTime;
    @TableField(value = "review_id")
    private Integer reviewId;
    @TableField(value = "review_time")
    private Timestamp reviewTime;


}
