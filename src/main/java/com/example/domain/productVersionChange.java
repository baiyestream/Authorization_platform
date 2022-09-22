package com.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("tbl_product_version_change")
public class productVersionChange {

    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    @TableField(value = "product_id")
    private Integer productId;
    @TableField(value = "local_address")
    private String localAddress;
    @TableField(value = "version_number")
    private String versionNumber;
    @TableField(value = "launch_time")
    private Timestamp launchTime;
    @TableField(value = "create_id")
    private Integer createId;
}
