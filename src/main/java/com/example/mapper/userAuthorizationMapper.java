package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.userAuthorization;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface userAuthorizationMapper extends BaseMapper<userAuthorization> {



    @Insert("<script>" +
            "INSERT INTO tbl_user_authorization(id,product_supply_id,username,IMEI,product_name,organization_name" +
            ",batch_number,phone_number,authorization_time,activate_code)VALUES" +
            "<foreach collection= 'userAuthorizations' item= 'userAuthorization' separator= ',' > " +
            "(" +
            " #{userAuthorization.id},#{userAuthorization.productSupplyId}," +
            " #{userAuthorization.username},#{userAuthorization.IMEI}," +
            " #{userAuthorization.productName},#{userAuthorization.organizationName}," +
            " #{userAuthorization.batchNumber},#{userAuthorization.phoneNumber}," +
            " #{userAuthorization.authorizationTime},#{userAuthorization.activateCode}" +
            ")" +
            "</foreach>" +
            "</script>")
    boolean insertBatch01(@Param("userAuthorizations") List<userAuthorization> userAuthorizations);

    @Insert("<script>" +
            "INSERT INTO tbl_user_authorization(id,username,activate_code)VALUES" +
            "<foreach collection = 'userAuthorizations' item = 'userAuthorization' separator = ',' > " +
            "(" +
            " #{userAuthorization.id},#{userAuthorization.username},#{userAuthorization.activateCode}" +
            ")" +
            "</foreach>" +
            "</script>")
    boolean insertBatch02(@Param("userAuthorizations") List<userAuthorization> userAuthorizations);
}















