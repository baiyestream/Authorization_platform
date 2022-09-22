package com.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("tbl_organizational_change")
public class organizationChange {

    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    @TableField(value = "organization_id")
    private Integer organizationId;
    @TableField(value = "state_before")
    private Integer stateBefore;
    @TableField(value = "state_after")
    private Integer stateAfter;
    @TableField(value = "change_reason")
    private String changeReason;
    @TableField(value = "change_time")
    private Timestamp changeTime;
    @TableField(value = "update_id")
    private Integer updateId;
    @TableField(value = "review_id")
    private Integer reviewId;
    @TableField(value = "effective_time")
    private Timestamp effectiveTate;
}
