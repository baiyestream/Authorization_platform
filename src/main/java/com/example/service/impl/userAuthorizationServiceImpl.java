package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.userAuthorization;
import com.example.mapper.userAuthorizationMapper;
import com.example.service.userAuthorizationService;
import org.springframework.stereotype.Service;

@Service
public class userAuthorizationServiceImpl extends ServiceImpl<userAuthorizationMapper, userAuthorization> implements userAuthorizationService {
}
