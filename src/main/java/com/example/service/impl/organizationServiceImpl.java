package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.Organization;
import com.example.mapper.organizationMapper;
import com.example.service.organizationService;
import org.springframework.stereotype.Service;

@Service
public class organizationServiceImpl extends ServiceImpl<organizationMapper, Organization> implements organizationService {
}
