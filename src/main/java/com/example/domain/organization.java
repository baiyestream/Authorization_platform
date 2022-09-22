package com.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Timestamp;
import java.util.Date;

@Data
@TableName("tbl_organization")
public class organization {

    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    @TableField(value = "organization_Name")
    private String organizationName;
    @TableField(value = "contact_address")
    private String contactAddress;
    @TableField(value = "legal_representative")
    private String legalRepresentative;
    @TableField(value = "corporate_telephone")
    private String corporateTelephone;
    @TableField(value = "contacts")
    private String contacts;
    @TableField(value = "contact_number")
    private String contactNumber;
    @TableField(value = "duty_paragraph")
    private String dutyParagraph;
    @TableField(value = "registration_time")
    private Date registrationTime;
    @TableField(value = "state")
    private Integer state;
    @TableField(value = "estabilshment_time")
    private Date estabilshmentTime;
    @TableField(value = "enterprise_scale")
    private Integer enterpriseScale;
    @TableField(value = "business_scope")
    private String businessScope;
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
