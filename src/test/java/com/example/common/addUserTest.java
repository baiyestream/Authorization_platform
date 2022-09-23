package com.example.common;

import com.example.domain.userAuthorization;
import com.example.mapper.userAuthorizationMapper;
import com.example.service.userAuthorizationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class addUserTest {

    @Autowired
    private userAuthorizationMapper userAuthorizationMapper;

    @Autowired
    private userAuthorizationService userAuthorizationService;

    @Test
    void addUserTest01(){
        List<userAuthorization> adduser = new ArrayList<>();

        for(int i = 1;i<101;i++){
            userAuthorization user = new userAuthorization();
            user.setId(i);
            user.setProductSupplyId(1);
            user.setUsername("测试用户"+i);
            user.setIMEI("111122223333444");
            user.setProductName("蓝牙耳机降噪软件");
            user.setOrganizationName("吉林唐彩有限公司");
            user.setBatchNumber("OROO1PR001BA0001");
            user.setPhoneNumber("15843211111");
            user.setAuthorizationTime(new Date());
            user.setActivateCode(UUIDStringUtils.randomUUID());

            adduser.add(user);
        }

        long startTime = System.currentTimeMillis();
        userAuthorizationService.saveBatch(adduser);
        long endTime = System.currentTimeMillis();
        System.out.println("耗时"+(endTime-startTime));


//        long startTime = System.currentTimeMillis();
//        userAuthorizationMapper.insertBatch01(adduser);
//        long endTime = System.currentTimeMillis();
//        System.out.println("耗时"+(endTime-startTime));

    }

    @Test
    void addUserTest02(){
        List<userAuthorization> adduser = new ArrayList<>();

        for(int i = 1 ;i < 11 ;i++){
            userAuthorization user = new userAuthorization();
            user.setId(i);
            user.setUsername("测试用户"+i);
            user.setActivateCode(UUIDStringUtils.randomUUID());
        }

        long startTime = System.currentTimeMillis();
        userAuthorizationMapper.insertBatch02(adduser);
        long endTime = System.currentTimeMillis();
        System.out.println("耗时"+(endTime-startTime));

    }
}
